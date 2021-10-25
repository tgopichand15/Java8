package com.example.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {






    public static void main(String[] args) {
        Employee e=new Employee("Gopi",5,10000,"O");
        Employee e1=new Employee("Tinku",8,40000,"o+");
        Employee e2=new Employee("Bharathi",30,60000,"o-");
        Employee e3=new Employee("AnandaRao",40,80000,"B+");

        List<Employee> l=new ArrayList<Employee>();
        l.add(e);
        l.add(e1);
        l.add(e2);
        l.add(e3);

        //filter list based on salary
        System.out.println("filtering collections based on salary "+l.stream().filter(u->u.getSalary() > 4000).collect(Collectors.toList()));

        //get names of employees whose salary is greater than 40000
        System.out.println("get employee names whose salary is greater than 40000 "+l.stream().filter(u->u.getSalary() > 40000).map(Employee::getName).collect(Collectors.toList()));

        //get names of employees whose Experience is greater than 5
        System.out.println("getting employee names whose years of experience is greater than 5 "+l.stream().filter(u->u.getYearsOfExperience() > 5).map(Employee::getName).collect(Collectors.toList()));


        System.out.println("sorting based on employee name "+l.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).filter(p->p.getSalary()>15000).map(Employee::getName).collect(Collectors.toList()));

        System.out.println("sorting based on employee salary" +l.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).map(Employee::getName).collect(Collectors.toList()));



        Optional<Employee> maxSalary=l.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minSalary=l.stream().min(Comparator.comparing(Employee::getSalary));


        if(maxSalary.isPresent() || minSalary.isPresent()){
            System.out.println("maximum salary is "+maxSalary.get().getSalary());
            System.out.println("minimum salary is "+minSalary.get().getSalary());
        }

        //Optional.of(output)

        //maxSalary.orElse();





    }

}
