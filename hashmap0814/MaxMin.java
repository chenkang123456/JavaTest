package com.test.hashmap0814;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入第一个数:");
		int m=sc.nextInt();
		System.out.println("输入第二个数:");
		int n=sc.nextInt();
		
		System.out.println("最大公约数："+max(n,m%n));
		System.out.println("最小公倍数："+m*n/max(m,n));
		
	}
	public static int max(int m, int n){
	    if(m < n){   //保证m>n
	        int temp = n;
	        n = m;
	        m = temp;
	    }
	    if(m%n == 0){
	        return n;
	    }
	    return max(n,m%n);
	}
	//最小公倍数
	public int min(int m, int n){
	    return m*n/max(m,n);
	}
}

