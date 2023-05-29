package com.exercise;

public class reverseString {
    public static void main(String[] args) {
   String rev ="";
    String S="neha";
    for(int i = S.length() - 1; i >= 0; i--){
        rev=rev+S.charAt(i);
    }
        System.out.println(rev);
    }
}

