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
    	assertEquals(new Money(10.0).getAmount(), dollar.multiply(2));
    	assertEquals(new Money(30.0).getAmount(), dollar.multiply(3));
    	assertEquals(new Money(0.0).getAmount(), dollar.multiply(0));
    }
    
    public void testSum(){
    	Money dollar = new Money(5);
    	assertEquals(10.0, dollar.sum(5));
    }
    
    public void testDivide(){
    	Money dollar = new Money(10);
    	assertEquals(5.0, dollar.divide(2));
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
    
    public void testConvertCurrency(){
    	Money dollar = new Money(5);
    	Money reais = new Money(dollar.multiply(4));
    	assertEquals(20.0, reais.getAmount());
    }
    
    public void testEquals(){
    	assertTrue(new Money(5).equals(new Money(5)));
    	assertFalse(new Money(5).equals(new Money(6)));
    	
    }
}
