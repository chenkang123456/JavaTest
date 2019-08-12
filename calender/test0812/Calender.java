package com.calender.test0812;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calender {
	public static void main(String[] args){
		Date date = new Date();	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		
		Date date2=new Date(date.getTime()-1000*60*60*24);
		
		System.out.println(sdf.format(date2));
		
		Date birthday = greDate(1998,10,3);
	}

	private static Date greDate(int y, int m, int d) {
		Date date=new Date(y,m,d);
		GregorianCalendar gc=new GregorianCalendar(y,m-1,d);
		return gc.getTime();
	}
	
	/**
	 * 从Date中解析 整数的年月日
	 */
	
	public static int[] getIntVal(Date date){
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(date);
		
		int year =gc.get(GregorianCalendar.YEAR);
		int month = gc.get(GregorianCalendar.MONTH)+1;
		int day = gc.get(GregorianCalendar.DAY_OF_MONTH);
		
		int h =gc.get(GregorianCalendar.HOUR_OF_DAY);
		int m = gc.get(GregorianCalendar.MINUTE);
		int s = gc.get(GregorianCalendar.SECOND);
		return new int[]{year,month,day,h,m,s};
	}
;}
