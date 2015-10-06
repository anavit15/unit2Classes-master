/**
* Write a description of class Door here.
* 
* @author Alex Komar & Stephen Fan $ Anavi Tekriwal
* @version 9/15/15
*/
public class Door
{
/** A boolean variable saying if the door is open(true) or closed(false) */
private boolean open;
/** A string variable that states the name of the door */
private String name; 

/**
* Constructor that asks for the name of the door, and if the door is open. (true/false)
*/
public Door(String name,boolean open)
{
// initialise instance variables
this.open = open;
this.name = name;
}

/**
* sets the stauts of the instance variable open to true
*
* @post The instance variable open is true
*/
public void open()
{
// sets the status of open to true
this.open = true;
}

/**
* sets the stauts of the instance variable open to false
*
* @post The instance variable open is false
*/
public void close()
{
// sets the status of open to false
this.open = false;
}

/**
* Returns the name of the door to the user
*
* @return A string that is the name of the door
*/
public String getName()
{
// returns the name of the door
return name;
}

/**
* Returns the state of the door to the user
*
* @return A boolean object that if true the door is open, if false 
* the door is closed
*/
public boolean getState()
{
// returns the name of the door
return open;
}

/**
* An example of a method - replace this comment with your own
* that describes the operation of the method
* @param name has to be a string
*/
public void setName(String name)
{
// sets the name of the door
this.name = name;
}


}