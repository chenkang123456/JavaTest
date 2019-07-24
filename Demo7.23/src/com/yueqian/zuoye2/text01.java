package com.yueqian.zuoye2;

import java.util.Scanner;

public class text01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要判断的数：");
		int num = sc.nextInt();
		int a=num/100;
		int b=num%100/10;
		int c=num%10;
		
			if(num==a*a*a+b*b*b+c*c*c){
				System.out.println(+num+"是水仙花数");
			}else{
				System.out.println(+num+"不是水仙花数");
			}
		
	}
}
