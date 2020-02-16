package com.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("234", "Hhon", "hodor", "hodor@game.es");
        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("123", "ewf" , "ewf","thisisit");
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        return employees;
    }
}
