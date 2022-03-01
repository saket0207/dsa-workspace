package org.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestBox {

//Group employees according to their departments

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Saket", "Red", 25000, "Dev"),
                new Employee("Manish", "Blue", 25000, "Dev"),
                new Employee("Rohit", "Teal", 25000, "Admin"),
                new Employee("Nishant", "Yellow", 25000, "Admin"),
                new Employee("Aishwarya", "Orange", 25000, "HR"),
                new Employee("Sneha", "Torquise", 25000, "HR"),
                new Employee("Aniket", "Red", 25000, "Dev"));

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        collect.forEach((department, employeeByDept) -> {
            System.out.println(department);
            employeeByDept.forEach(employee -> System.out.printf("%s%n", employee));
        });
        System.out.printf("\n");
        Map<String, Long> employeeCountByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.counting()));
        employeeCountByDepartment.forEach(
                (key, value)->{
                    System.out.println("Department " + key + " Count " + value);

                });

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // convert array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);



        String [] arr = stream1.flatMap(Stream::of).toArray(String[]::new);
        Arrays.stream(arr).forEach(x-> System.out.print(x + " "));

    }
}
