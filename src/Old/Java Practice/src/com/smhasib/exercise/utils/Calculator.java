package com.smhasib.exercise.utils;

import com.smhasib.exercise.geometry.Circle;
import com.smhasib.exercise.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7.2);
        Rectangle rectangle1 = new Rectangle(10, 5);
    
        double circleArea = Math.PI * Math.pow(circle1.radius, 2);
        double rectangleArea = rectangle1.length * rectangle1.width;
        
        System.out.printf("Rectancle Area: %f\nCircle Area: %f", rectangleArea, circleArea);
    }
}
