package Person;

public class Executive extends Employee{
	
	private double addsalery;
	private double sumMonty;
	

	

	public Executive(String name, int age, String gender, int number, double selery, double addsalery) {
		super(name, age, gender, number, selery);
		this.addsalery = addsalery;
	}
	public double getAddsalery() {
		return addsalery;
	}

	public void setAddsalery(double addsalery) {
		this.addsalery = addsalery;
	}
	
	private double getSumMoney() {
		return this.getSelery() + this.getAddsalery();
	}	

	@Override
	public String toString() {
		return super.toString()+"\t补贴:" + addsalery+
		"\t总工资:"+getSumMoney()	;
	}

	
	
}
