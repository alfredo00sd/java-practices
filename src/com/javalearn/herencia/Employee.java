package com.javalearn.herencia;

public class Employee extends Person {

    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    Employee(String name, double salary) {
        super(name);
        this.idEmployee = employeeCounter++;
        this.salary = salary;
    }
    //super, manda a llamar algun metodo o atributo de la clase padre
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //get the object state
    @Override
    public String toString() {
        return super.toString() + "Employee{" + "idEmployee=" + idEmployee + ", salary=" + salary + '}';
    }

}
