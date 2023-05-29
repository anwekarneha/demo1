package com.exercise;

public class countEven {
    public static void main(String[] args) {
    int countEven=0;
    int sumEven=0;
    for(int i=1;i<=10;i++) {
        if (i % 2 == 0) {
            countEven++;
            sumEven += i;
        }
    }
    System.out.println(countEven);
        System.out.println(sumEven);
}
}
