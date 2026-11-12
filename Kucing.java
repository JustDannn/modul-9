package com.mycompany.modul9;

/**
 * Subclass Kucing yang meng-override suara() dari Hewan.
 *
 * Nama   : Nur Fattah Hamdani
 * NIM    : 103102400001
 */
public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkata: Meong!");
    }

    // Method khusus Kucing — tidak bisa dipanggil lewat referensi Hewan
    public void terkam() {
        System.out.println(nama + " menerkam mangsa!");
    }
}
