package com.playalong.CallCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static Employee getRandomEmployee(List<Employee> employeeList) {
        if (employeeList.size() == 0)
            return null;
        int index = (int)Math.floor(Math.random()*employeeList.size());
        return employeeList.get(index);
    }

    private static List<Employee> getEmployeesByRank(List<Employee> employees, Enums.Rank rank) {
        return employees.stream().filter(e->e.getRank() == rank).collect(Collectors.toList());
    }

    public static List<Employee> getNonEngagedEmployeesByRank(List<Employee> employees, Enums.Rank rank) {
        List<Employee> allEmployees = getEmployeesByRank(employees, rank);
        List<Employee> nonEngagedEmployees = new ArrayList<>();
        for (Employee employee: allEmployees) {
            if (!employee.isEngaged) {
                nonEngagedEmployees.add(employee);
            }
        }
        return nonEngagedEmployees;
    }

}
