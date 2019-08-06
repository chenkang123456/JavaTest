package Shape;


import java.util.Arrays;

public class Test {
	public static void main(String[] args){
	Shape shapes[]  = {
			new Rectangle(0,2,0,2),
			new Triangle(0,2,2,0,0,3),
			new Circle(0,0,3)
				   
	};
	for(Shape s:shapes){
		System.out.println(s);
	}
  }
}
