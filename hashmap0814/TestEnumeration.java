package com.test.hashmap0814;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.StringTokenizer;

//Enumeration 接口是Iterator 迭代器的“古老版本”
public class TestEnumeration {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入邮箱地址:");
		String str=sc.nextLine();
		Enumeration enu = new StringTokenizer(" chenkang@dakang.com","@");
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		
	} 	
}