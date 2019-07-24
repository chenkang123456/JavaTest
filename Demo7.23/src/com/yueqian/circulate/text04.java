package com.yueqian.circulate;

public class text04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<100;i++){
			int sum1=3*100+i;
			int sum2=10*i+3;
			if(sum2-sum1==468){
				System.out.println(i);
			}	
		}
	}
}
