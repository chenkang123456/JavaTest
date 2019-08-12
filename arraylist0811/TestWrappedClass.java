package com.arraylist0811;

public class TestWrappedClass {
	public static void main(String[] args){
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(30);
		
		int c=b.intValue();
		double d=b.doubleValue();
		
		Integer e=new Integer("9999");
		Integer f=Integer.parseInt("999999999");
		String str=f.toString();
		
		System.out.println("int类型最大整数"+Integer.MAX_VALUE);
		
		
	}

}
