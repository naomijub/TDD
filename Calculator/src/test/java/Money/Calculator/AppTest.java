package Money.Calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testMultiplication(){
    	Money dollar = new Money(5);
    	dollar.multiply(2);
    	assertEquals(10.0, dollar.getAmount());
    	dollar.multiply(3);
    	assertEquals(30.0, dollar.getAmount());
    	dollar.multiply(0);
    	assertEquals(0.0, dollar.getAmount());
    }
    
    public void testSum(){
    	Money dollar = new Money(5);
    	dollar.sum(5);
    	assertEquals(10.0, dollar.getAmount());
    }
    
    public void testDivide(){
    	Money dollar = new Money(10);
    	dollar.divide(2);
    	assertEquals(5.0, dollar.getAmount());
    }
    
    public void testMod(){
    	Money dollar = new Money(10);
    	dollar.mod(2);
    	//assertEquals(0, dollar.getAmount());
    	assertEquals(0, dollar.getModAmount());
    }
    
    public void testConvert(){
    	Money dollar = new Money(5);
    	dollar.convert(4.0);
    	assertEquals(20.0, dollar.getAmount());
    }
}
