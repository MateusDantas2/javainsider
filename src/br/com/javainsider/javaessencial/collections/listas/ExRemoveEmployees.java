package br.com.javainsider.javaessencial.collections.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static br.com.javainsider.javaessencial.collections.listas.Employee.Status.ACTIVE;
import static br.com.javainsider.javaessencial.collections.listas.Employee.Status.INACTIVE;

public class ExRemoveEmployees {
    public static void main(String[] args) {
        var employees = List.of(
            new Employee("Empregado A", ACTIVE),
            new Employee("Empregado B", INACTIVE),
            new Employee("Empregado C", ACTIVE),
            new Employee("Empregado D", INACTIVE),
            new Employee("Empregado E", ACTIVE)
        );

        var activeEmployees = removeInactive(employees);
        System.out.println(employees);
        System.out.println(activeEmployees);
    }

    private static List<Employee> removeInactive(List<Employee> employees) {
        var activeEmployees = new ArrayList<Employee>();
        activeEmployees.addAll(employees);

        var iter = activeEmployees.iterator();
        while (iter.hasNext()) {
            if (iter.next().getStatus() == INACTIVE) {
                iter.remove();
            }
        }
        return activeEmployees;
    }
}
