package Money.Calculator;

public class Money {

	//private int amount;
	private double amount;
	private int modAmount;
	
	//public Money(int x){
	public Money(double x){
		this.amount = x;
	}
	
	//public void multiply(int x){
	public void multiply(double x){
		//amount = amount * 2;
		//amount = amount * x;
		amount *= x;
	}
	
	public void divide(double x){
		amount /= x;
	}
	
	//public void sum(int x){
	public void sum(double x){
		amount += x;
	}
	
	public void mod(int x){
		modAmount = (int)amount;
		modAmount = modAmount % x;
	}
	
	//public int getAmount(){
	public double getAmount(){
		return amount;
	}
	
	public int getModAmount(){
		return modAmount;
	}
}
