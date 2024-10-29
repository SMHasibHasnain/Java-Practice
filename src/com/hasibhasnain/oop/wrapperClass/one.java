package com.hasibhasnain.oop.wrapperClass;

public class one {
    public static void main(String[] args) {
        int normalVariable = 10;

        Integer wrapperClass = normalVariable;

        Integer wrapperClass2 = Integer.valueOf(wrapperClass);

        Integer wrapperClass3 = wrapperClass2;

        System.out.println(normalVariable);
        System.out.println(wrapperClass);
        System.out.println(wrapperClass2);
        System.out.println(wrapperClass3);
    }
}
