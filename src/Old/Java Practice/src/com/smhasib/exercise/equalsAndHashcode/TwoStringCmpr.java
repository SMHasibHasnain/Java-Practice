package com.smhasib.exercise.equalsAndHashcode;

public class TwoStringCmpr {
    public String one;
    public String two;

    public void cmpr() {
        System.out.println(one.equals(two));
    }

    public static void main(String[] args) {
        TwoStringCmpr cmprsn1 = new TwoStringCmpr();
        cmprsn1.one = "Hasib";
        cmprsn1.two = "Hasib";
        cmprsn1.cmpr();
    }
}
