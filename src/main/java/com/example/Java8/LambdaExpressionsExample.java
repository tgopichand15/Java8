package com.example.Java8;

public class LambdaExpressionsExample {


//lambda expressions are used to implement functional interface  and reduce coding
    public static void main(String[] args){

        //here before object creation we have create object for interface
        TestInterface l1=(int a,int b)->{System.out.println("a is "+a);
                System.out.println("b is "+b);
                return b/a;
        };



        System.out.println(l1.divide(4,8));
        //calling default method
        System.out.println(l1.add(2,3));

        /* //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();  */


        //for no parameters ()-> braces can be omited
        //eg:()->System.out.println("gopi");

        /*
        to print a list using lambda expression
        list.forEach(
            (n)->System.out.println(n)
        );
         */

        //example for functional interfaces are Runnable in thread class



    }
}
