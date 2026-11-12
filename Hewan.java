package com.mycompany.modul9;

/**
 * Kelas induk Hewan untuk demo Polymorphism.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class Hewan {

    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method umum yang bisa di-override subclass (dasar polymorphism)
    public void suara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}
