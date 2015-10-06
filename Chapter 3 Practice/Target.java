import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A target shape that can be positioned anywhere.
 * 
 * @author Anavi Tekriwal
 * @version September 22, 2015
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private double radius;
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Target
     */
    public Target(double radius, int x, int y)
    {
        this.radius=radius;
        this.x=x;
        this.y=y;
    }

    /**
     * Draws the target
     * @param    the graphics context

     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1= new Ellipse2D.Double(this.x,this.y,this.radius+125,this.radius+125);
        Ellipse2D.Double circle2= new Ellipse2D.Double(this.x+12.5,this.y+12.5,this.radius+100,this.radius+100);
        Ellipse2D.Double circle3= new Ellipse2D.Double(this.x+25,this.y+25,this.radius+75,this.radius+75);
        Ellipse2D.Double circle4= new Ellipse2D.Double(this.x+37.5,this.y+37.5,this.radius+50,this.radius+50);
        Ellipse2D.Double circle5= new Ellipse2D.Double(this.x+50,this.y+50,this.radius+25,this.radius+25);
        
        g2.setColor(Color.BLACK);
        g2.fill(circle1);
        g2.setColor(Color.WHITE);
        g2.fill(circle2);
        g2.setColor(Color.BLACK);
        g2.fill(circle3);
        g2.setColor(Color.WHITE);
        g2.fill(circle4);
        g2.setColor(Color.BLACK);
        g2.fill(circle5);
        
    }

}
