package com.javalearn.herencia;

public class Person {
    private String name;
    private byte age;
    private char gender;
    private String address;

    public Person() {
    }
    //Se pueden tener varias sobrecargas siempre que estan tengan diferente tipo de data y orden en la llamada
    //Constructor importa el orden y tipo de los parametros.
    public Person(String name, byte age, char gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() { return age; }

    void setAge(byte age) { this.age = age; }

    public char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    //Over-write a method from the parent class, as there is not extends (in this case) the parent class is object
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
