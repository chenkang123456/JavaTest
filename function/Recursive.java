package com.recursive.function;

public class Recursive {
	public static int f(int x){
		if(x==0){
			return 0;
		}else{
			return 2*f(x-1)+x*x;
		}
	}

	public static void main(String[] args) {
		
		f(5);
		System.out.println(f(1));
		
	}

}
