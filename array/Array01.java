package com.two.dimensional.array;

public class Array01 {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];


        for (int i=0; i < 10; i++) {
            System.out.println();
            for (int j=0; j <= i; j++) {
                if (j == 0) {
                    arr[i][j]=1;
                } else {
                    arr[i][j]=arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");

            }

        }
    }
}