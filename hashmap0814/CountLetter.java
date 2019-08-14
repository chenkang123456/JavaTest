package com.test.hashmap0814;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLetter {
	public static void main(String[] args){
	String string="System up with the top down,"
				+ "Got the city on lock down,"
				+ "Drive by in the low ride,"
				+ "Hands high when we fly by,"
				+ "System up with the top down,"
				+ "Got the city on lock down,"
				+ "Drive by in the low ride,"
				+ "Hands high when we fly by.";
	char chs[]=string.toCharArray();//转换成char数组
		
		int count=0;
		System.out.println("字符串："+string+"中小写字母有：");
		for(char ch='a';ch<'z';ch++)
		{
			count=0;//计数器
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					count++;
			}
			if(count!=0)
				System.out.println("字符中"+ch+"有"+count+"个");
		}
		System.out.println("字符串："+string+"中大写字母有：");
		for(char ch='A';ch<'Z';ch++)
		{
			count=0;//计数器
			for(int i=0;i<chs.length;i++)
			{
				if(ch==chs[i])
					count++;
			}
			if(count!=0)
				System.out.println("字符中"+ch+"有"+count+"个");
		}

	}
	
	
}
		
