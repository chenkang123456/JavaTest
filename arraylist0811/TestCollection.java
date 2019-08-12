package com.arraylist0811;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
/*
 * 1.存储对象可以考虑 数组、集合
 * 3.集合
 *     Collection接口
 *     List接口，存储有序的，可以重复的元素
 *     ArrayList(主要的实现类)、LinkedList、Vector
 *     Set接口，存储无序的，不可重复的元素
 *     HashMAp、LinkedHashMap、TreeMap、Hashtable(子类,Properties)
 */
public class TestCollection {
	@Test
	public void testCollection(){
		Collection coll=new ArrayList();
		coll.add(123);
		coll.add(new String("AA"));
		coll.add(new Date());
		coll.add("BB");
		coll.add(new Person("MM",23));
		System.out.println(coll);
		
	}

}
