package com.arraylist0811;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args){
	Calendar cd=new GregorianCalendar(2999,10,9,22,24,50);
	int year = cd.get(Calendar.YEAR);
	System.out.println(year);
	}

}
