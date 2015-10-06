import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.*;
/**
 * Creates the center of the ferris wheel
 * 
 * Anavi Tekriwal 
 * October 5, 2015
 */
public class CircleReflection
{
    // instance variables - replace the example below with your own
   private double radius;
   private int x;
   private int y;

    /**
     * Constructor for objects of class FilledCircle
     */
    public CircleReflection(double radius, int cx, int cy)
    {
        this.radius=radius;
        this.x=cx;
        this.y=cy;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1= new Ellipse2D.Double(this.x,this.y,this.radius+25,this.radius+25);
        Ellipse2D.Double circle2= new Ellipse2D.Double(this.x-4.5,this.y-4.5,this.radius+35,this.radius+35);
        Ellipse2D.Double circle3= new Ellipse2D.Double(this.x-145,this.y-160,this.radius+325,this.radius+325);
        Ellipse2D.Double circle4= new Ellipse2D.Double(this.x-157.5,this.y-172.5,this.radius+350,this.radius+350);
        
        Color color =new Color(140,140, 140, 100);//lighter black
        g2.setColor(color);
        g2.fill(circle1);
        g2.setStroke(new BasicStroke(3));
        g2.draw(circle2);
        g2.setStroke(new BasicStroke(5));
        g2.draw(circle3);
        g2.draw(circle4);
    }
}
