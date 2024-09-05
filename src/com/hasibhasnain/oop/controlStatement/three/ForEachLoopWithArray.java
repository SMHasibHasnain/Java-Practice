package com.hasibhasnain.oop.controlStatement.three;

public class ForEachLoopWithArray {
    public static void main(String[] args) {
        int[] nums = {12, 10, 23, 32, 53, 42, 45, 13, 34};
        int sum = 0;
        for(int i : nums) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
