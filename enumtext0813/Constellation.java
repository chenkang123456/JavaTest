package com.enumtext0813;

enum Constellation {
	ARIES("ARIES","白羊座","3.21~4.20"),
	TAURUS("TAURUS","金牛座","4.21~5.21"),
	GEMINI("GEMINI","双子座","5.22~6.21"),
	CANCER("CANCER","巨蟹座","6.22~7.22"),
	LEO("LEO","狮子座","7.23~8.23"),
	VIRGO("VIRGO","处女座","8.24~9.23"),
	LIBRA("LIBRA","天秤座","9.24~10.23"),
	SCORPIO("SCORPIO","天蝎座","10.24~11.22");
	private String englishName;
	private String chineseName;
	private String Date;
	
	private Constellation(String englishName, String chineseName, String date) {
		this.englishName = englishName;
		this.chineseName = chineseName;
		Date = date;
	}
	public String getEnglishName() {
		return englishName;
	}
	public String getChineseName() {
		return chineseName;
	}
	public String getDate() {
		return Date;
	}
	@Override
	public String toString(){
		return "英文名："+englishName+"\t中文名："+chineseName+"\t时间段："+Date;
	}
}
