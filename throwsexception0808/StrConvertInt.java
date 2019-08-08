package com.throwsexception0808;

import java.util.Scanner;

public class StrConvertInt {
	int convert(String str) throws ParameterInvalidException{
		for(int i=0;i<str.length();i++){	
			if(str.charAt(i)<'0' || str.charAt(i)>'9'){			 
				throw new ParameterInvalidException("输入字符串非法");
				
			}	
			
		}
		
		return Integer.valueOf(str);
		
	}

}
