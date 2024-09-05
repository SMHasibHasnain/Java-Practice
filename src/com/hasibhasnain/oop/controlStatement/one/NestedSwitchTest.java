package com.hasibhasnain.oop.controlStatement.one;

public class NestedSwitchTest {
    public static void main(String[] args) {
        int i = 3, j = 1;
        switch (i) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.print("Three ");
                switch (j) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                }
        }
    }
}
