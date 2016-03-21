package Number.Fibonacci;

public class Fibonacci {
	public void Fibonacci(){}
	
	//public int fibonacciN(){
	public int fibonacciN(int n){
		//return 0;
		if(n == 0){return 0;}
		//else{return 1;}
		else{
			if(n <= 2){
				return 1;
			}
			else{
				return fibonacciN(n - 1) + fibonacciN(n - 2);
			}
		}
	}
}
