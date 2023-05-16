package com.driver;

public class Product {
    int x, y, z;
    double a, b;

    public Product(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Product(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Product(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
