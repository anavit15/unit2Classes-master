

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author Anavi Tekriwal
 * @version September 21, 2015
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        cans=10;
        tokens=0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testFillUp()
    {
        VendingMachine vendingMachine=new VendingMachine();
        assertEquals(10, vendingMachine.getCanCount());
        vendingMachine.fillUp(10);
        assertEquals(20, vendingMachine.getCanCount());
    }
    @Test
    public void testInsertToken()
    {
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.insertToken();
        assertEquals(9, vendingMachine.getCanCount());
        assertEquals(1, vendingMachine.getTokenCount());
    }
    @Test
    public void testGetCanCount()
    {
        VendingMachine vendingMachine=new VendingMachine();
        assertEquals(10, vendingMachine.getCanCount());
        
    }
    @Test
    public void testGetTokenCount()
    {
        VendingMachine vendingMachine=new VendingMachine();
        assertEquals(0, vendingMachine.getTokenCount());
        
    }
    
}
