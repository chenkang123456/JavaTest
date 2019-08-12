package com.arraylist0811;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args){
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String str=df.format(new Date(4000000));
	    System.out.println(str);
	    
	    DateFormat df2=new SimpleDateFormat("D");
	    String str2=df2.format(new Date());
	    System.out.println(str2);
	    
	}
}
