package com.exercise;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("leap year");
            } else if ( year % 100 == 0 && year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not leap year");
            }
        }else{
            System.out.println("enter valid year");
        }
    }
}