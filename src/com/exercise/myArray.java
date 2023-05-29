package com.exercise;

import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        int result=0;
        int[] myNum = {2, 1, 6, 5, 7, 9};
        for (int i = 1; i < myNum.length; i++) {
            if (myNum[i] % 2 == 0) {
                System.out.println(myNum[i]);
            }
        }
        for (int a : myNum) {
            if (a % 2 == 0) {
                sum+=a;
                count++;
            }

        }
        System.out.println("sum of even no is : "+sum);
        System.out.println("sum of even no is : "+count);
    }
}