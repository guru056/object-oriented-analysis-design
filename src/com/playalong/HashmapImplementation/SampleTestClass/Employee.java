package com.playalong.HashmapImplementation.SampleTestClass;

import java.util.Objects;

public class Employee {
    int employeeId;
    String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }
}
