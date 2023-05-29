package com.bridgelabz;

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        int total = 0;
        int i;
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
