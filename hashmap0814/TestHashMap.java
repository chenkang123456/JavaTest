package com.test.hashmap0814;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class TestHashMap {
	
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入邮箱:");
		String str=sc.nextLine();
		
		while(!str.equals("no")){
			list.add(str);
			
		}
		createHashMap(list);
	}
		public static void createHashMap(List<String> list)
		{		
		Map<String,String> map=new HashMap<String,String>();

		for(String s:list){
			String key = s.substring(0,s.indexOf("@"));
			map.put(key, s);
		}
		
		Set set2 = map.entrySet();
		for(Object obj:set2){
			Map.Entry entry=(Map.Entry)obj;
			//System.out.println(entry.getKey() + "----->" + entry.getValue());
			System.out.println(entry);
		
		}
		
	}

}
