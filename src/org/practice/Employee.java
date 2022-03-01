package org.practice;

public class Employee {

    private String name;
    private String favColor;
    private int salary;
    private String department;

    public Employee(String name, String favColor, int salary, String department) {
        this.name = name;
        this.favColor = favColor;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", favColor='" + favColor + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'';
    }
}
