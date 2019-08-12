package com.arraylist0811;

public class TestAutoBox {
	public static void main(String[] args)
	{
		Integer a =234;//自动装箱。Integer a=Integer.valueOf(234);
		int b=a;//自动拆箱，编译器会修改成:int b=a.Value();
		
		Integer c=null;
		if(c!=null){
			int d=c;//自动拆箱：调用了：c.intValue()
		}
		
		
		
		
		
		
	}
}
