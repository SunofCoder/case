package com.senem.enoca.payload.request;

import com.senem.enoca.models.Employee;

import java.util.List;

public class CompanyRequest {

    private Long id;

    private String name;

    private String address;

    private String mail;

    private List<Employee> employee;

    public CompanyRequest () {
    }

    public CompanyRequest(Long id, String name, String address, String mail, List<Employee> employee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
