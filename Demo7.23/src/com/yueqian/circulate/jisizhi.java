package com.yueqian.circulate;

public class jisizhi {
	public static void main(String[] args) {
		int n=30;
		double sum=1.0;	
		int s=1;			
		for(int j=1;j<=n;j++){
			s=s*j;	
			sum =sum+(double)1/s;		
		}		
		System.out.println(sum);
	}
}