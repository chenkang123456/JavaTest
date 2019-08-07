package com.yueqian.port0807;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		Student stu[] =new Student[10];
		stu[0]=new Student(001,"san1",19);
		stu[1]=new Student(002,"san2",20);
		stu[2]=new Student(003,"san3",19);
		stu[3]=new Student(004,"san4",34);
		stu[4]=new Student(005,"san5",2);
		stu[5]=new Student(006,"san6",11);
		stu[6]=new Student(007,"san7",18);
		stu[7]=new Student(8,"san8",16);
		stu[8]=new Student(9,"san9",6);
		stu[9]=new Student(10,"san10",9);
		for(Student s:stu){
			System.out.println(s);
		}
		System.out.println("-----------------------------------------");
		Arrays.sort(stu);
		for(Student s:stu){
			System.out.println(s);
		}
	}
}
