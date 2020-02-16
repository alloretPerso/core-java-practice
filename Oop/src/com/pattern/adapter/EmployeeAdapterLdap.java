package com.pattern.adapter;

public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getID() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGiveName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
