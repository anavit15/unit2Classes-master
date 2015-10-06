import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Creates a rectangle building 
 * 
 * Anavi Tekriwal 
 * @October 5
 */
public class Building extends Background
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
     * Constructor for object of class Building1 that specify the location of the building
     */
    public Building(int x, int y,int w,int h)
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
     * @pre        xLeft and yTop must be ints
    
     * @param   xLeft   the x coordinate of the top left corner of the building
     *          yTop    the y coordinate of the top left corner of the building

     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.black);
        
        Rectangle building1=new Rectangle ( xLeft,yTop,xWidth,yHeight);
        g2.fill(building1);
        
        
    }

}
