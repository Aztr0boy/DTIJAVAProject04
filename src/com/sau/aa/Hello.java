package com.sau.aa;

import org.w3c.dom.ls.LSOutput;

public class Hello {
    //data member
    public int a;
    public int b = 10 ;


    //method member
    public static void showA() {
        System.out.println(a);
    }

    public static void showB() {
        System.out.println(b);
    }

    public static void showAB() {
        System.out.println(a+b);
    }

    //constructor
    //public Hello( ){ } empty constructor
    public Hello( ){
        this.a = 0 ;
        System.out.println("Hello...");
    }
    public Hello( ){
        System.out.println("Hoo...");
    }

    public Hello (String x){
        System.out.println("HI...");
    }
}


