package com.ventas.online;

import com.ventas.Order;
import com.ventas.Product;

/**
 * Sales class, to create the product related it with a order, and print the order
 *
 * @author Alfredo Acosta
 * @version 0.1
 * @see Product class.
 * @see Order class.
 * */
public class Sales {

    /**
     * Method to create the products, and added it to the order and show the order.
     * */
    public static void main(String[] args) {

        Product backpack = new Product("Mochila totto", 3_260.57);
        Product smartphone = new Product("LG X black series", 5_678.65);
        Product laptop = new Product("Hp 245 Ops series",39_874.85);

        //Make the order
        Order alfredShopping = new Order();
        alfredShopping.addProduct(backpack);
        alfredShopping.addProduct(smartphone);
        alfredShopping.addProduct(laptop);

        alfredShopping.showOrder();
    }
}
