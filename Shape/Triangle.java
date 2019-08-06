package Shape;

public class Triangle extends Shape {
	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;
	public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getX3() {
		return x3;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getY3() {
		return y3;
	}
	public void setY3(int y3) {
		this.y3 = y3;
	}
	
	public String toString() {
		return "三角形面积:" + Area() + 
				"\t 周长:" +Perimeter();
	}
	@Override
	public double Area() {
		double a=Math.sqrt(Math.pow((y2-y1), 2)+Math.pow((x2-x1),2));
		double b=Math.sqrt(Math.pow((y3-y1), 2)+Math.pow((x3-x1),2));
		double c=Math.sqrt(Math.pow((y3-y2), 2)+Math.pow((x3-x2),2));
		
		double p=(a+b+c)/2;
		if(a>0 && b>0 && c>0 && a+b>c && a-b<c){
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}else{
			return -1;
		}
		/*double p = ((Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)))+
				   (Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2)))+
				   (Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2))))/2;
	    return Math.sqrt(p * (p - (Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)))) 
	    				   * (p - (Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2)))) 
	    				   * (p - (Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2)))));*/ 
	}
	@Override
	public double Perimeter() {
		/*return ((Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)))+
				(Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2)))+
				(Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2)))); 
		*/
		double a=Math.sqrt(Math.pow((y2-y1), 2)+Math.pow((x2-x1),2));
		double b=Math.sqrt(Math.pow((y3-y1), 2)+Math.pow((x3-x1),2));
		double c=Math.sqrt(Math.pow((y3-y2), 2)+Math.pow((x3-x2),2));
		return (a+b+c);
		
	}
	
	
}
