package modul9;

import com.mycompany.modul9.Employee;
import com.mycompany.modul9.SalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demo Collection: sorting (Comparable & Comparator) dan filtering.
 */
public class DemoCollection {

    public static void main(String[] args) {
        // === Buat list Employee ===
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey",   2500));
        listEmp.add(new Employee("anna",  3500));

        // === Sorting by name (Comparable) ===
        Collections.sort(listEmp);
        System.out.println("--- Sorted by name (Comparable) ---");
        listEmp.forEach(System.out::println);

        // === Sorting by salary (Comparator) ===
        listEmp.sort(new SalaryComparator());
        System.out.println("--- Sorted by salary (Comparator) ---");
        listEmp.forEach(System.out::println);

        // === Filtering: gaji >= 3000 (konvensional) ===
        System.out.println("--- Filter gaji >= 3000 (for-loop) ---");
        for (Employee e : listEmp) {
            if (e.getSalary() >= 3000) {
                System.out.println(e);
            }
        }

        // === Filtering: gaji >= 3000 (stream) ===
        System.out.println("--- Filter gaji >= 3000 (stream) ---");
        listEmp.stream()
               .filter(e -> e.getSalary() >= 3000)
               .forEach(System.out::println);
    }
}
