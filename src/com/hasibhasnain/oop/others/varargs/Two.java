package com.hasibhasnain.oop.others.varargs;

public class Two {

    public static int add (int a, int b, int... c) { //... is ellipsis
        int sum = a + b;
        for (int i : c) {
            sum += i;
        }
        return sum;
    }

    public static int add (int a, int b) {
        return a+b;
    }

    public static String add (int a) {
        return "There is only one number!";
    }

    public static void main(String... args) {
        System.out.println(add(4, 5, 4, 5 ,6));
        System.out.println(add(5, 6, 9, 45, 54, 3, 45, 4, 22, 43, 4));
        System.out.println(add(4,3));
        System.out.println(add(2));
    }
}
