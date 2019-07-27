package com.two.dimensional.array;

import java.util.Random;

public class Array {
    public static void main(String[] args){
        Random R1=new Random();
        int num=R1.nextInt(5)+5;
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=R1.nextInt(10);
        }
        for(int s:arr){
            System.out.print(s+"\t");
        }
    }
}
