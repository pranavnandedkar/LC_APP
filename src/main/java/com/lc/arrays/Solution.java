package com.lc.arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for(int i =0; i < arr.length; i++){
            int currentSmallest = i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[currentSmallest] > arr[j]){
                    currentSmallest = j;
                }
            }
            if(i != currentSmallest){
                swapCount++;
                int temp = arr[i];
                arr[i] = arr[currentSmallest];
                arr[currentSmallest] = arr[i];
            }
        }
        return swapCount;
    }


    static void minimumBribes(int[] q) {
        int countSwaps =0;
        for(int i = 0; i < q.length; i++){
            if(q[i]-1 >= (i-2)
                    &&  q[i]-1 <= (i+2)){

            }else {
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i =0; i < q.length-1; i++){
            if(q[i] != i+1){
                for(int j = i-1; j <= i+2 ; j++){
                    if(j>0 && j < q.length && q[j] == i+1){
                        countSwaps = countSwaps + swap(q,i,j);
                        break;
                    }
                }
            }
        }
        System.out.println(countSwaps);
    }
    private static int swap(int[] q, int i,int j){
        int counter =0;
        for(int p=j; p >i; p--){
            counter++;
            int temp = q[p];
            q[i] = q[p-1];
            q[p-1] = temp;
        }
        return counter;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int[] arr = new int[10];

        arr[0]=1;
        arr[1]=2;
        arr[2]=5;
        arr[3]=3;
        arr[4]=7;
        arr[5]=8;
        arr[6]=6;
        arr[7]=4;
        System.out.println(arr[9]);

        minimumBribes(arr);

    }
}
