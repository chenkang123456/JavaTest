package com.arraylist0811;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList {
	/*
	 * List中相对于Collection，新增加的方法
	 * void add(int index,Object ele):在指定是索引位置index添加元素ele
	 * boolean addAll(int index,Collection eles)
	 * Object get(int index):获取指定索引的元素
	 * int indexOf(Object obj):返回Obj在集合中首次出现的位置。没有的话返回-1；
	 * int lastIndex(Object obj):返回Obj在集合中最后一次出现的位置没有的话
	 * Object remove(int index):删除指定索引位置的元素
	 * Object set(int index,Object ele):设置指定索引位置的元素为ele
	 * List subList(int fromIndex,int toIndex)：返回从fromIndex到toIndex结束的一个子list
	 * 
	 * List常用的方法：增(add(Object obj))  删(remove)  该(set(int index,Object obj))
	 * 查(get(int index)) 插(add(int index,Object ele))   长度(size())
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void testList2(){
		List list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("BB"));
		list.add(456);
		System.out.println(list.indexOf(456));
		System.out.println(list.lastIndexOf(456));
		System.out.println(list.indexOf(123)==list.lastIndexOf(123));
		System.out.println(list.indexOf(444));
		
		List list1=list.subList(0,3);
		System.out.println(list1);
	}
	@Test
	public void testList1(){
		List list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("BB"));
		System.out.println(list);
		list.add(0,555);
		System.out.println(list);
		Object obj=list.get(1);
		System.out.println(obj);
		list.remove(0);
		System.out.println(list.get(0));
		
		
	}

}
