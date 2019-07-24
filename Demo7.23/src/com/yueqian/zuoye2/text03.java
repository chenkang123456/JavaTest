package com.yueqian.zuoye2;

import java.util.Scanner;

public class text03 {

	public static void main(String[] args) {
		int sum=0;
		int month2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年");
		int year =sc.nextInt();
		System.out.println("请输入月");
		int month =sc.nextInt();
		System.out.println("请输入日");
		int day =sc.nextInt();
			
		
		switch(month-1){
		case 12:
			sum=sum+31;	
		case 11:
			sum=sum+30;
		case 10:
			sum=sum+31;
		case 9:
			sum=sum+30;
		case 8:
			sum=sum+31;	
		case 7:
			sum=sum+31;
		case 6:
			sum=sum+30;			
		case 5:
			sum=sum+31;	
		case 4:
			sum=sum+30;	
		case 3:
			sum=sum+31;	
		case 2:
			if(year%4==0||year%400==0){
				sum=sum+29;
			}else{
				sum=sum+28;
			}	
		case 1:
			sum=sum+31;	
			break;
	   }
		sum =sum+day;
		System.out.println(sum+"天");
	}
}
