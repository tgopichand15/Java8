package com.example.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {






    public static void main(String[] args) {
        Employee e=new Employee("Gopi",5,10000,"O","Development");
        Employee e1=new Employee("Tinku",8,40000,"o+","Testing");
        Employee e2=new Employee("Bharathi",30,60000,"o-","Development");
        Employee e3=new Employee("AnandaRao",40,80000,"B+","IT Support");

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


        System.out.println("grouping based on employee department "+l.stream().collect(Collectors.groupingBy(Employee::getDepartment)));


       //grouping by based on department and finding out count of employees in each department
        System.out.println(l.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));


        //sorting based on department name and filtering based on salary

        System.out.println(l.stream().sorted((o1,o2)->(int)(o1.getName().compareTo(o2.getName()))).filter(u->u.getSalary() >50000).map(Employee::getName).collect(Collectors.toList()));

        //sorting based on names
        System.out.println(l.stream().sorted((o1,o2)->(int)(o1.getName().compareTo(o2.getName()))).collect(Collectors.toList()));

        //sort arraylist in reverse order

        List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
        List<Integer> sortedList = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("sorted list is "+sortedList);


        //limit results to only 1

        System.out.println("limit results to only 1 "+l.stream().filter(u->u.getSalary() > 50000).limit(1).collect(Collectors.toList()));


        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(6);

        System.out.println("fetching even numbers "+a.stream().filter(u->u%2==0).collect(Collectors.toList()));
        System.out.println("fetching odd numbers "+a.stream().filter(u->u%2!=0).collect(Collectors.toList()));

        //System.out.println(stream.of(1,2,3,4,5).filter(i->i==4).collect(Collectors.toList()));


        List<String> list1 = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");


        //list1.stream().sorted((o1,o2)->(int)(o1.getName().compareTo(o2.getName()))).forEach(System.out::println);

        //list1.stream().sorted((o1,o2)->(int)(o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());


        // using parallelStream()
        // method for parallel stream
        System.out.println(list1.parallelStream().map(k->k.toUpperCase()).collect(Collectors.toList()));


        String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
        Stream<String> myStream = Arrays.stream(myArray);

        String[] a1=myStream.map(r->r.toUpperCase()).toArray(String[]::new);
        System.out.println("output is "+a1);



        int[] a2={1,4,5,7,2};
        //Double Average=Arrays.stream(a2).mapToDouble(t->Double.parseDouble(t)).average();

       // System.out.println("average is "+Average);

        //l.stream().sorted((o1,o2)->o2.getName.compareTo(o1.getName)).map(Employee::getName).forEach(System.out::println);
        l.stream().sorted(Comparator.comparing(Employee::getName)).forEach(emp->System.out.println(emp.getName()));
        System.out.print("salary based is ");
        l.stream().sorted((o1, o2) -> (int)(o1.getSalary() -o2.getSalary())).map(Employee::getSalary).forEach(System.out::println);

        System.out.println("salary greater than 20000 names");
        l.stream().filter(u->u.getSalary()>=20000).limit(1).map(Employee::getName).forEach(System.out::println);







    }

}
