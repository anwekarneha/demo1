package com.exercise;
import java.util.Arrays;
public class practice1 {
    public static void main(String[] args) {
        int[] myNum = {2, 1, 6, 5, 7, 9};
        int n=myNum.length;
        int a;
        int b;
        int[] newArr=new int[2];
        for (int i = 0; i < myNum.length; i++) {
            for(int j=i+1; j < myNum.length; j++){
               if( myNum[i]+myNum[j]==7) {
            //       System.out.println(myNum[i]);
            //      System.out.println(myNum[j]);
                  newArr[i] = i;
              //    newArr[i+1] = j;

               }
               if(j<=i+1){
                 break;
              }

            }
            System.out.println(Arrays.toString(newArr));
            }

            }
        }



