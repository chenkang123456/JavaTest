package com.test.hashmap0814;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public  class LetterCount {
	public static void main(String[] args){
		total();
	}
	
	
	public static void total() {
		String str="System up with the top down,"
				+ "Got the city on lock down,"
				+ "Drive by in the low ride,"
				+ "Hands high when we fly by,"
				+ "System up with the top down,"
				+ "Got the city on lock down,"
				+ "Drive by in the low ride,"
				+ "Hands high when we fly by.";
	
		
			List<CharCount> list = new ArrayList<>();
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				//创建CharCount对象，封装字符。
				CharCount charCount = new CharCount(c, 1);
				//集合中是否包含当前字符
				if(list.contains(charCount)) {//包含
					int index = list.indexOf(charCount);//获得下标
					CharCount temp = list.get(index);
					temp.setCount(temp.getCount()+1);//改变字符的个数。
					list.set(index, temp);//将加1后的对象覆盖到原来位置
				}else {//不包含
					list.add(charCount);
				}
			}
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
			Collections.reverse(list);
			System.out.println(list);
		}
}
class CharCount implements Comparable<CharCount>{
	private Character name;
	private Integer count;
	public CharCount(Character name, Integer count) {
		this.name = name;
		this.count = count;
	}
	public Character getName() {
		return name;
	}
	public void setName(Character name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return name + "  " + count +"次\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharCount other = (CharCount) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(CharCount o) {
		if(this.count>o.count) {
			return 1;
		}else if(this.count<o.count) {
			return -1;
		}
		return 0;
	}
	
}
