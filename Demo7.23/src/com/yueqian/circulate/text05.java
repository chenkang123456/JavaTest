package com.yueqian.circulate;

public class text05 {

	public static void main(String[] args) {
		for(int i=1000;i<10000;i++){
			int a=i/1000;//千位
			int b=i%1000/100; //百位
			int c=i%100/10;
			int d=i%10;
			if(a+b+c+d==6 && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
				System.out.println(i);
			}
		}
	}
}
