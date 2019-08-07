package com.throw0807;
/*
 * throw关键字抛出异常
 */
public class shoot {
	static void pop()throws NegativeArraySizeException{  //定义方法并抛出NegativeArraySizeException异常
		int arr[]=new int[-3];				//创建数组
	}
	public static void main(String[] args){
		try{
			pop();			//调用pop()方法
		}catch(NegativeArraySizeException e){
			System.out.println("pop()方法抛异常");    //输出异常信息
		}
		
	}
}
