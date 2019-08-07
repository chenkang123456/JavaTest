package com.yueqian.port0807;

/*类的第5个成员：内部类

1相当于说，在类的内部在定义类。外部类，内部类

2内部类的分类，成员内部类(声明在类内部且方法外的)

局部内部类(声明在类的方法里)

3成员内部类

      是外部类的一个成员:①可以有修饰符(4个)②static final③可以调用外部类的属性方法

      具体类的特点：①abstract②可以在其内部定义属性、方法、构造器

4局部内部类

5关于内部类掌握三点

    ①如何创建成员内部类的对象

    ②如何区分调用外部类、内部类的变量

    ③局部内部类的使用

*/

public class TestInnerClass{

//创建静态的内部类对象，可以直接通过外部类的调用静态内部类的构造器

public static void main(String[] args){

Person.Dog d=new Person.Dog();

//创建非静态的内部类对象，必须先创建外部类的对象，通过外部类的对象调用内部类的构造器

Person p=new Person();

Person.Bird b=p.new Bird();
b.info();

}

}

class Person{

String name;

int age;

//成员内部类(非static的)

class Bird{

String name;

int id;

public Bird(){

}
public void setName(String name){

}

public void info(){
	show();
}
}

//成员内部类(静态内部类)

static class Dog{

}

public void show(){
	System.out.println("我是show方法");
}

public void method1(){
	class A{}
}

}