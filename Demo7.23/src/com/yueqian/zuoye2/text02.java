package com.yueqian.zuoye2;

public class text02 {

	public static void main(String[] args) {
		for(int i=1990;i<=2015;i++){
			if(i%4==0 || i%400==0){
				System.out.println(+i+"\t");
			}
		}
	}
}
