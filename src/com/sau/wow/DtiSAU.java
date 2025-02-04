package com.sau.wow;

public class DtiSAU {
    //องค์ประกอบของClass
    //DATA Member ข้อมูล
    String name;
    int birthyear;
    int age;
    double high = 100;

    //Method Member
    public static void showHi() {
        System.out.println("Hi..." + name);
    }

    public static void calAndShowAge() {
        age = 2568 - birthyear ;
        System.out.println("Your Age " + age);
    }
}
