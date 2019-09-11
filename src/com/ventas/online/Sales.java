package com.ventas;

public class Sales {
    public static void main(String[] args) {
        //Create products
        Product backpack = new Product("Mochila totto", 3_260.57);
        Product smartphone = new Product("LG X black series", 5_678.65);
        Product laptop = new Product("Hp 245 Ops series",39_874.85);

        //Make the order
        Order alfredShopping = new Order();
        alfredShopping.addProduct(backpack);
        alfredShopping.addProduct(smartphone);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(laptop);
        alfredShopping.addProduct(backpack);

        alfredShopping.showOrder();
    }
}
