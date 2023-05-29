package com.bridgelabz;

public class conditional_statements {
    public static void main(String[] args) {
     int num1=10;
     int num2=20;
        if ( num1== num2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        String result = (num1> num2) ? "num1 is greater" : "num2 is greater";
        System.out.println(result);
    }
}

