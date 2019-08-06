package Person;

public class Employee extends Person{
	
	private int number;
	private double selery;
	public Employee(String name, int age, String gender, int number, double selery) {
		super(name, age, gender);
		this.number = number;
		this.selery = selery;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSelery() {
		return selery;
	}
	public void setSelery(double selery) {
		this.selery = selery;
	}
	@Override
	public String toString() {
		return super.toString()+"\t 职工号:"+number+"\t基本工资" + selery;
	}
	
	

}
