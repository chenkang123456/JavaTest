package com.enumtext0813;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/*
 * Collection接口
 * Map接口
 * |----HashMap:Map的主要实现类
 * |----LinkedHashMap:使用链表维护添加进Map中的顺序，故遍历Map时，是按添加的顺序遍历的。
 * |----TreeMap:按照添加进Map中的元素的key的指定属性进行排序.要求key必须是同一个类的对象！
 * 针对key 自然排序 vs 制定排序
 * |----Hashtable:古老的实现类，线程安全，不建议使用
 * |----Propertied:长用来处理属性文件，键和值都为String类型
 * 
 */
import org.junit.Test;

public class TestMap {
	@Test
	public void test6(){
		Properties pros = new Properties();
		
	}
	
	//定制排序
	
	//自然排序
	@Test
	public void test4(){
		Map map=new TreeMap();
		map.put(new Person("AA",13),88);
		map.put(new Person("BB",46),99);
		map.put(new Person("CC",89),23);
		map.put(new Person("EE",23),89);
		Set set1=map.keySet();
		for(Object obj:set1){
			System.out.println(obj + "----->" + map.get(obj));
		}
		
	}
	
	@Test
	public void test3(){
		Map map=new LinkedHashMap();
		map.put("BB", 213);
		map.put("AA", 456);
		map.put("CC", 789);
		map.put("null", null);
		map.put(new Person("EE",23),89);
		Set set1=map.keySet();
		for(Object obj:set1){
			System.out.println(obj + "----->" + map.get(obj));
		}
		
	
	}
	
	/*
	 * 如何遍历Map
	 * Set keySet()
	 * Collection values()
	 * Set entrySet()
	 */
	@Test
	public void test2(){
		Map map=new HashMap();
		map.put("BB", 213);
		map.put("AA", 456);
		map.put("CC", 789);
		map.put("null", null);
		map.put(new Person("EE",23),89);
		//2.遍历key值
		Set set = map.keySet();
		for(Object obj:set){
			System.out.println(obj);
		}
		//2.遍历value集
		Collection values=map.values();
		Iterator i = values.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		//3.如何遍历key-value对
		//方式一：
		Set set1=map.keySet();
		for(Object obj:set1){
			System.out.println(obj + "----->" + map.get(obj));
		}
		//方式二：
		Set set2 = map.entrySet();
		for(Object obj:set2){
			Map.Entry entry=(Map.Entry)obj;
			//System.out.println(entry.getKey() + "----->" + entry.getValue());
			System.out.println(entry);
		
		}
	}
	
	/*
	 * Object put(Object key,Object value):向Map中添加一个元素
	 * Object remove(Object key):按照指定的key删除此key-value
	 * void putAll(Map t)
	 * void clear():清空
	 * Object get(Object key):获取指定key的value值,若无此key,则返回null
	 * boolean containKey(Object key)
	 * boolean containValue(Object value)
	 * int size():返回集合的长度
	 * boolean isEmpty()
	 * boolean equals(Object obj)
	 * 
	 * 1. HashMap,key是用Set来存数的，不可重复，value是用Collection来存放
	 * 的，课重复一个key-value对，是一个Entry，所有的Entry是用Set存放的，
	 * 也是不可重复的
	 * 2.向HashMap中添加元素时，会调用Key所在的类的equals()方法，判断两个key是否
	 * 相同，若相同则只能添加进后添加的那个元素。
	 */
	@Test
	public void test1(){
		Map map=new HashMap();
		map.put("BB", 213);
		map.put("AA", 456);
		map.put("CC", 789);
		map.put("null", null);
		map.put(new Person("EE",23),89);
		map.put(new Person("EE",23),89);
		map.put(new Person("EE",23),89);
		System.out.println(map.size());
		System.out.println(map);
		map.remove("BB");
		System.out.println(map);
		Object value=map.get("AA");
		System.out.println(value);
	}

}
