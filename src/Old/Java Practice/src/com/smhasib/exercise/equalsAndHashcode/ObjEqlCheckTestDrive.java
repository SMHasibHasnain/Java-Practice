package com.smhasib.exercise.equalsAndHashcode;

public class ObjEqlCheckTestDrive {
    public static void main(String[] args) {
        ObjEqlCheck person1 = new ObjEqlCheck("Hasib","1", "SWE");
        ObjEqlCheck person2 = new ObjEqlCheck("Hasib","2", "SWE");
        System.out.println(person1.equals(person2));
        
    }
}
