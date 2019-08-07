package com.yueqian.port0807;

import java.util.Arrays;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "编号:" + id + "\t 姓名:" + name + "\t 年龄:" +age;
	}
	public int compareTo(Student o) {
		if(this.age >o.age){
			return -1;
		}
		if(this.age <o.age){
			return 0;
		}
		else{
			return 1;
		}
	}
}
