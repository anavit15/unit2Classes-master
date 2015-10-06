import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws the target shape.
 * 
 * @author Anavi Tekriwal
 * @version Septmeber 22, 2015
 */
public class TargetComponent extends JComponent
{
    
   
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
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2= (Graphics2D) g;
        Target target1=new Target(0,150,150);
        Target target2=new Target(0,250,250);
        target1.draw(g2);
        target2.draw(g2);
    }

}
