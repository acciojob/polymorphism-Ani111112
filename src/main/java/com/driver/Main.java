package com.driver;

public class Main {
    static public class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double a, double b) {
            return a * b;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(10, 20));
        System.out.println(p.product(2, 5, 6));
        System.out.println(p.product(5.5, 6.2));
    }
}