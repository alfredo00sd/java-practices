package com.ventas;

/**
 * Order class, to package the products in a order to be payed
 *
 * @author Alfredo Acosta
 * @version 0.1
 * @see Product class.
 * */
public class Order {
    private int orderId;
    private Product products[];
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;

    /**
     * constructor of the class and orderId initializer.
     * */
    public Order(){
        this.orderId = orderCounter++;
        products = new Product[MAX_PRODUCTS];
    }

    /**
     * @param product object
     * */
    public void addProduct(Product product){
        //if the number of products is not bigger than the max_product size,
        //then added it to the array.
        if(productCounter < MAX_PRODUCTS){
            //add new product to the position in the array, corresponding to the product and increase productCounter value
            products[productCounter++] = product;
        }else {
            System.out.println("Se ha alcanzado el numero maximo de articulos en esta orden "+MAX_PRODUCTS+" : "+productCounter);
        }
    }

    /**
     * @return total to pay.
     * */
    private double getOrderTotal(){
        double total = 0;

        for(int i = 0; i < productCounter; i++){
         total += products[i].getProductPrice();
        }
        return total;
    }

    /**
     * Show the order and the products associated with it...
     * */
    public void showOrder(){
        System.out.println("Orden # "+orderId);
        System.out.println("El total de la orden es RD$" + getOrderTotal());
        System.out.println("Productos en la orden: ");
        for (int i = 0; i < productCounter; i++){
            System.out.println(products[i]);
        }
    }
}
