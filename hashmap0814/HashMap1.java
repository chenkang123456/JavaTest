package com.test.hashmap0814;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap1 {
	public static void boxEmail() {
		//接收邮箱，构成map输出。
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String email1 = sc.next();
		while(!email1.equals("no")) {
			list.add(email1);
			email1 = sc.next();
		}
		System.out.println(list);
		Map<String,String> map =new HashMap<String,String>();
		for (String email : list) {
			int index = email.indexOf("@");
			String key = email.substring(0,index);
			map.put(key, email);
		}
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}	
}