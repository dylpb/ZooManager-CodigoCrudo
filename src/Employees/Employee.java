/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.time.LocalDate;

/**
 *
 * @author Dylan
 */
public class Employee {
    
    protected int id;
    protected String name;
    protected LocalDate birth;
    protected String phone;
    protected String salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, LocalDate birth, String phone, String salary) {
        this.id = id;
        this.name = name;
    if (!birth.isAfter(LocalDate.now()))
        this.birth = birth;
    if (phone.matches("^\\\\d{2}-\\\\d{2}-\\\\d{2}-\\\\d{2}$"))
        this.phone = phone;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", birth=" + birth + ", phone=" + phone + ", salary=" + salary + '}';
    }
    
    
    
    
    
    
}
