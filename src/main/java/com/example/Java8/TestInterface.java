package com.example.Java8;

public interface TestInterface {
    default public int add(int a, int b){
        return a+b;
    }
    public int divide(int a, int b);
}

