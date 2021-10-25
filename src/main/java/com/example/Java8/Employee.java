package com.example.Java8;

public class Employee {

    String Name;

    int yearsOfExperience;

    int Salary;

    String Bloodgroup;

    public Employee(String Name,int yearsOfExperience,int Salary,String Bloodgroup){
        this.Name=Name;
        this.yearsOfExperience=yearsOfExperience;
        this.Salary=Salary;
        this.Bloodgroup=Bloodgroup;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", Salary=" + Salary +
                ", Bloodgroup='" + Bloodgroup + '\'' +
                '}';
    }
}
