package com.labs;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    // 1
    public double average() {
        return EmployeeRepository.getEmployees().stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    // 2
    public Map<String, String> empWithMaxSal() {
        return EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                opt -> opt.get().getFirstName()
                        )
                ));
    }

    // 3
    public Map<String, Double> totalSal() {
        return EmployeeRepository.getEmployees().stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.summingDouble(Employee::getSalary)
                ));
    }

    // 4
    public List<String> empNameAndSal() {
        return EmployeeRepository.getEmployees().stream()
                .map(e -> e.getFirstName() + " - " + e.getSalary())
                .collect(Collectors.toList());
    }

    // 5
    public List<String> sortSalInDesc() {
        return EmployeeRepository.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(e -> e.getFirstName() + " - " + e.getSalary())
                .collect(Collectors.toList());
    }
}