package com.ventas;

public class Order {
    private int orderId;
    private Product products[];
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;

    public Order(){
        this.orderId = orderCounter++;
        products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(){
        //if the number of products is not bigger than the max_product size,
        //then added it to the array.

    }
}
