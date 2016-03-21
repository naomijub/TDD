package Number.Fibonacci;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testFibonacciN(){
    	int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}};
    	Fibonacci fib = new Fibonacci();
    	//assertEquals(0, fib.fibonacciN(0));
    	//assertEquals(1, fib.fibonacciN(1));
    	for(int i = 0;i < 8;i++){
    		assertEquals(cases[i][1], fib.fibonacciN(cases[i][0]));
    	}
    }
}
