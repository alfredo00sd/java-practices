package com.javalearn.herencia;

import java.util.Date;

public class RunHerencia {
    public static void main(String[] args){

        //Arrays old way to create and instantiate them.
        //You must indicate an max value to the array, they are not allowed to be changed dynamically
        Employee employees [] = new Employee[10];

        employees[0] = new Employee("Alfredo", 20000);
        employees[0].setGender('M');
        employees[0].setAge((byte)20);
        employees[0].setAddress("Los guandules #42 Brisas del mar");

        employees[1] = new Employee("Carmen", 10000);
        employees[1].setGender('F');
        employees[1].setAge((byte)28);
        employees[1].setAddress("carmen rosa #32 Caliche bonito");

        for (int i = 0; i <= employees.length; i++) {
            if(employees[i] == null){
                return;
            }System.out.println(employees[i]);
        }

        Client client1 = new Client(new Date(),false );
        client1.setName("Juan Quintero");
        client1.setAge((byte)23);
        client1.setGender('M');
        client1.setAddress("El caimito #12");

        Client client2 = new Client(new Date(),true );
        client2.setName("Juana en Olla.");
        client2.setAge((byte)32);
        client2.setGender('F');
        client2.setAddress("El caimito #18");

        System.out.println("first Client = " + client1);
        System.out.println("second Client = " + client2);
    }
}
