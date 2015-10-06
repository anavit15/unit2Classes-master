

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. 
 * The car can be driven a certain distance.
 * 
 * @author Anavi Tekriwal 
 * @version September 10, 2015
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon */
    private double fuelEfficiency;
    
    /**amount of fuel left in the cars tank in gallons*/
    private double fuelInTank;
    

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car( double fuelEfficiency)
    {
       //initialize instance variable
       this.fuelEfficiency=fuelEfficiency;
       this.fuelInTank=0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount of fuel in the tank.
     *
     * @pre        specified distace cannot result in the consumption of gas than is available
     *      
     * 
     * @param    distance    distance that the car drives in miles
  
     */
    public void drive(double distance)
    {
     this.fuelInTank-= distance/this.fuelEfficiency;
    }
    
    /**
     * This returns the amount of gas in the car's tank in gallons
     *
     * 
     * @return This returns the amount of gas in the car's tank in gallon
     */
    public double getGasInTank()
    {
      return this.fuelInTank;
    }

    /**
     * Increments the fuel in the car's tank by the specified amount in gallons
     *
     * @pre    gallons of gas must be a positive number
     * @param   gallonOfGas amount of gas to add to the car's tank in gallons

     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank+=gallonsOfGas;
    }

}
