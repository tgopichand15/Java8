package com.example.Java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        //this is helpful in avoiding nullpointer exception

       // Optional<String> output = Optional.empty();

        String output=null;

        //general way of checking other than java 8 features without orelse
        if(output!=null){
            System.out.println(output.toUpperCase());
        }
        else{
            output="java8";
            System.out.println(output.toUpperCase());
        }

        Employee e=new Employee("Gopi",5,10000,"o+");



        //optional.empty returns empty optional object
        Optional<Object> emptyOptional=Optional.empty();

        System.out.println(emptyOptional);



        //java 8 way of implementing lines 16 to 22
        //of method throws null pointer exception if value passed is null
        //optional.ofNullable accepts null and not null values also so better to use ofNullable method
        Optional<String> optional=Optional.of(output);

        //optional.isPresent returns true if variable optional contains value if it is null it returns true
        //optional.get method returns values stored in varaibel
        /*if(optional.isPresent()) {
            System.out.println(optional.get().toUpperCase());
        }*/


        //Easiest way of writing lines in code 16 to 22 reduces boiler plate code with java 8 we can reduce lines of code
        String O=null;
        Optional<String> optionalString= optional.ofNullable(O);
        System.out.println(optionalString.orElse("java8").toUpperCase());

    }

}
