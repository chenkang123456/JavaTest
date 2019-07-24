package com.yueqian.circulate;

public class text08 {

	public static void main(String[] args) {
		for(int a=0;a<56;a++){
			for(int b=0;b<2048-a*a;b++){
				if(Math.pow(a,2)+Math.pow(b,2)==2048 && a*a+b*b>=2*a*b){					
					System.out.println("a的值为:"+a+"\t b的值为:"+b);
				}
				
			}
		}

	}

}
