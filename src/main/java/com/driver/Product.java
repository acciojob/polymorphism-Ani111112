package com.driver;

public class Product {
    int x, y, z;
    double a, b, c;

    public Product(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = this.x + this.y;
    }
    void getInt(){
        System.out.println(this.z);
    }

    public Product(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = this.a + this.b;
    }
    void getDouble(){
        System.out.println(this.c);
    }
}
