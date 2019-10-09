package com.javalearn.herencia;

public class MethodsOverwritten extends Person {
    public static void main(String[] args) {
        Employee john = new Employee("Johnattan",(byte)12,15_898.56);
        String sonDetails = john.getDetails();
        System.out.println("Details : "+sonDetails);
    }

}
