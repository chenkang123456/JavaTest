package com.exception0808;

import java.util.Scanner;

public class StrConvertInt {
	int convert(String str) throws ParameterInvalidException{
		//转换后返回的int值
		int val = 0;
		//第一个小数点在数组中的位置
		int index = str.indexOf(".");;
		//统计小数点个数
		int count = 0;
		for(int i=0;i<str.length();i++){	
			if(str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)=='.' ){			 
				if(str.charAt(i)=='.' ){
					count++;	
				}
			}	
			else{
				throw new ParameterInvalidException("输入字符串非法，请输入一个字符串类型的整数或者浮点数");				
			}
		}
		if(count == 1 && index != 0 && index != str.length()-1 || count == 0){
			val= Integer.valueOf(str.substring(0, index));
		}
		else if(count>1){
			throw new ParameterInvalidException("输入的字符串类型的整数或者浮点数中 ：小数点不止一个 ");
		}
		else if(index==0 ){
			throw new ParameterInvalidException("输入的字符串类型的整数或者浮点数中 ：小数点在首位");
		}
		else if(index==str.length()-1 ){
			throw new ParameterInvalidException("输入的字符串类型的整数或者浮点数中 ：小数点在末位");
		}
		return val;
	}

}
