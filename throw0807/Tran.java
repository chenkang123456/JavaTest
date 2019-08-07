package com.throw0807;
/*
 * 自定义异常
 */
public class Tran {                        //创建类
	//定义方法，抛出异常
	static int avg(int num1,int num2)throws Exception{
		if(num1<0||num2<0){     //判断方法中的参数是否满足指定条件
			throw new Exception("不可使用负数！");//错误信息
		}
		if(num1>100||num2>100){ //判断方法中的参数是否满足指定条件
			throw new Exception("数值大了！");  //错误信息
		}
		return (num1+num2)/2;
	}
	public static void main(String[] args){     //主方法
		try{									//try代码块处理可能出现异常的代码
			int result=avg(-2,-4);    			//调用avg()方法
			System.out.println(result);			//avg()方法返回值输出
		}catch(Exception e){
			System.out.println(e); 				//输出异常信息
		}
		
	}
}
