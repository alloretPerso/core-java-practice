package com.pattern.adapter;

public class EmployeeLdap {
    private String cn;
    private String surname;
    private String giveName;
    private String mail;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public EmployeeLdap(String cn, String surname, String giveName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.giveName = giveName;
        this.mail = mail;
    }
}
