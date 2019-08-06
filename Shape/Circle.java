package Shape;

public class Circle extends Shape{
	private static final double PI =3.14;
	private int x1;
	private int y1;
	private int R;
	
	public Circle(int x1, int y1, int r) {
		this.x1 = x1;
		this.y1 = y1;
		R = r;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getR() {
		return R;
	}
	public void setR(int r) {
		R = r;
	}
	@Override
	public double Area() {
		return PI*(Math.pow(R, 2));
	}
	@Override
	public double Perimeter() {
		return 2*PI*R;
	}
	
	@Override
	public String toString() {
		
		return "圆形面积:" + Area() + 
				"\t 周长:" +Perimeter();
	}
	
}
