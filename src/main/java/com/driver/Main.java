package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(5 , 10);
        p.getInt();
        p = new Product(10.20, 20.00);
        p.getDouble();
    }
}