package com.mycompany.modul9;

import java.util.Comparator;

/**
 * Comparator untuk sort Employee by salary (ascending).
 *
 * Dipakai saat butuh sorting alternatif selain default (by name).
 * Lebih fleksibel dari Comparable karena bisa dibuat banyak versi
 * tanpa mengubah kelas Employee.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        // Selisih positif → e1 lebih besar → e1 di belakang (ascending)
        return e1.getSalary() - e2.getSalary();
    }
}
