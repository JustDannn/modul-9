package com.mycompany.modul9;

/**
 * Demo Polymorphism: upcasting dan downcasting.
 *
 * Nama   : Nur Fattah Hamdani
 * NIM    : 103102400001
 */
public class DemoPolymorphism {

    public static void main(String[] args) {

        // === UPCASTING ===
        // Kucing di-assign ke referensi Hewan (upcasting otomatis)
        Hewan h = new Kucing("Whisker");
        h.suara();          // memanggil suara() versi Kucing (polymorphism)
        // h.terkam();      // ERROR — referensi Hewan tidak tahu method terkam()

        // === DOWNCASTING ===
        // Kembalikan ke tipe Kucing agar bisa akses terkam()
        if (h instanceof Kucing) {          // cek dulu sebelum cast — hindari ClassCastException
            Kucing k = (Kucing) h;          // cast eksplisit
            k.terkam();
        }

        // Contoh downcast gagal: ClassCastException saat runtime
        try {
            Hewan burung = new Hewan("Pipit");
            Kucing salah = (Kucing) burung;  // burung bukan Kucing → exception
        } catch (ClassCastException e) {
            System.out.println("Gagal downcast: " + e.getMessage());
        }
    }
}
