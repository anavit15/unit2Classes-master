

/**
 * Tells how many cans and tokens are in the vending machine
 * 
 * @author Anavi Tekriwal
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** An int variable saying how many cans are in the vending machine */
    private int cans;
    /** An int variable saying how many tokens are in the vending machine */
    private int tokens;

    /**
     * Constructor that initializes instance variables
     */
    public VendingMachine()
    {
        
        cans = 10;
        tokens=0;
    }
   
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *

     * @post    will add the number of cans that the user inputs
     * @param   number of cans must be an integer
 
     */
    public void fillUp(int addedCans)
    {
        
        this.cans+=addedCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     * @post    Will add one token to the machine and remove one can
    
     */
    public void insertToken()
    {
      
        this.tokens+=1;
        this.cans-=1;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
    
     * @return  returns the number of cans in the vending machine
     */
    public int getCanCount()
    {
        return this.cans;
    }
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
    
     * @return  returns the number of tokens in the vending machine
     */
    public int getTokenCount()
    {
        return this.tokens;
    }
}
