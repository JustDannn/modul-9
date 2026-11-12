package com.mycompany.modul9;

/**
 * Model data Employee untuk demo Collection, Sorting, dan Filtering.
 *
 * Implements Comparable<Employee> agar bisa di-sort by name
 * menggunakan Collections.sort() tanpa perlu Comparator tambahan.
 *
 * Nama   : Rifqi Reissal Arasy
 * NIM    : 1201230038
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName()  { return name; }
    public int getSalary()   { return salary; }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary;
    }

    // Sort by name A-Z (default sort)
    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }
}
