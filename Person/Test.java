package Person;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){

		Person[] emps = {
				new Person("小华",20,"男"),
				new Employee("小明", 20, "男", 001, 2000),
				new Executive("小丽", 22, "女", 002, 2000,200)
				
		};
		for(Person s:emps){
			System.out.println(s.toString());
		}
	}
}
