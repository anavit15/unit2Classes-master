import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Transparency;
/**
 * Write a description of class Bulding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildingReflection extends Background
{
    /** Location of the top left x coordinate of the building */
    private int xLeft;
    /** Location of the top left y coordinate of the building */
    private int yTop;
    /** Width of the building */
    private int xWidth;
    /** Height of the Building */
    private int yHeight;
    /**
     * Default constructor for objects of class Bulding
     */
    public BuildingReflection(int x, int y,int w,int h)
    {
        // initialise instance variables
        xLeft= x;
        yTop=y;
        xWidth=w;
        yHeight=h;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Color color =new Color(140,140, 140, 100);//lighter black
        g2.setColor(color);
        Rectangle building=new Rectangle ( xLeft,yTop,xWidth,yHeight);
        g2.fill(building);
       
    }

}