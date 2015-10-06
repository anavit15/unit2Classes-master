import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
/**
 * Creates the center of the ferris wheel
 * 
 * Anavi Tekriwal 
 * October 5, 2015
 */
public class LineReflection
{
    // instance variables - replace the example below with your own
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   private float penWidth;
    /**
     * Constructor for objects of class FilledCircle
     */
    public LineReflection(int x1,int y1, int x2, int y2,int w)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.penWidth=w;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setStroke(new BasicStroke(penWidth));
        Line2D.Float line=new Line2D.Float(x1, y1, x2, y2);
        Color color =new Color(140,140, 140, 100);//lighter black
        g2.setColor(color);
        g2.draw(line);
        
        
    }
}

