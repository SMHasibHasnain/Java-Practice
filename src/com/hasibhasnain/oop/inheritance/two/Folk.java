package com.hasibhasnain.oop.inheritance.two;

public class Folk extends Singer{
    String favsong;

    void myfavsong(String favsong) {
        this.favsong = favsong;
        System.out.printf("My fav song is: %s.\n", favsong);
    }
}
