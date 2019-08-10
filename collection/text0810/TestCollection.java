package com.collection.text0810;

import org.junit.Test;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/*
 * 1.存储对象可以考虑 数组 、集合、
 * 2.数组存储对象的特点  Student[] stu=new Student[20];stu[0]=new Student....
 * 	    弊端：一旦创建长度不可变，真实的数组存放对象的个数不可知
 * 3.集合
 *
 */
public class TestCollection {
	@Test
	public void testConnection(){
		Collection coll=new ArrayList();
		//1.size()返回集合中元素的个数
		System.out.println(coll.size());
		//2.add(object obj)向集合中添加元素
		coll.add(123);
		coll.add(123);
		coll.add(new Date());
		coll.add(123);
		coll.add(123);
		System.out.println(coll.size());
		//3.addAll(Collection coll):将形参coll中包含的所有元素添加到当前集合中
		Collection coll1=Arrays.asList(1,2,3,4);
		coll.addAll(coll1);
		System.out.println(coll.size());
		//查看集合元素
		System.out.println(coll);
		//4.isEmpty():判断集合是否为空
		System.out.println(coll.isEmpty());
		//5.clear():清空集合元素
		coll.clear();
		System.out.println(coll.isEmpty());
	}
}
