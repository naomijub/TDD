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
	//public void multiply(double x){
	public double multiply(double x){
		//amount = amount * 2;
		//amount = amount * x;
		amount *= x;
		return amount;
	}
	
	//public void divide(double x){
	public double divide(double x){
		amount /= x;
		return amount;
	}
	
	//public void sum(int x){
	//public void sum(double x){
	public double sum(double x){
		amount += x;
		return amount;
	}
	
	//public void mod(int x){
	public int mod(int x){
		modAmount = (int)amount;
		modAmount = modAmount % x;
		return modAmount;
	}
	
	public void convert(double x){
		multiply(x);
	}
	
	public boolean equals(Object object){
		Money aux = (Money)object;
		return (amount == aux.getAmount());
	}
	
	//public int getAmount(){
	public double getAmount(){
		return amount;
	}
	
	public int getModAmount(){
		return modAmount;
	}
}
