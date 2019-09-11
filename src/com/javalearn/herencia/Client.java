package com.javalearn.herencia;

import java.util.Date;

public class Client extends Person {

    private int idClient;
    private Date registerDate;
    private boolean isVIP;
    private static int clientCounter;

    private Client() {
        this.idClient = ++clientCounter;
    }

    Client(Date registerDate, boolean isVIP){
        this(); //call the counter constructor / can only be used in this class
        this.registerDate = registerDate;
        this.isVIP = isVIP;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        this.isVIP = VIP;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return super.toString() +
        "Client{" + "idClient=" + idClient + ", registerDate=" + registerDate + ", isVIP=" + isVIP + '}';
    }
}
