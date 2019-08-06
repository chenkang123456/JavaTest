package com.recursive.function;

public class NiceTitle {
	public static void f(int n){
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		f(10);

	}

}
