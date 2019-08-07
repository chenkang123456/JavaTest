package com.throw0807;

public class Captor {
	static int quotient(int y,int x)throws myException{
		if(x<0){
			throw new myException("除数不为负数");
		}
		if(x==0){
			throw new myException("除数不为0");
		}
		return y/x;
	}
	public static void main(String[] args){
		try{
			int result=quotient(5,0);
		}catch(myException e){
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(Exception e){
			System.out.println("程序发生其他的异常");
		}
		
	}

}
