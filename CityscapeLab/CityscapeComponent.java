import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        Background background=new Background ();
        background.draw(g2);
        
        BuildingReflection buildingReflection1=new BuildingReflection(50,410,75,250);
        buildingReflection1.draw(g2);
        
        Building building1=new Building(50,230,75,250);
        building1.draw(g2);
        
        BuildingReflection building2Part1Reflection=new BuildingReflection(125,410,25,300);
        building2Part1Reflection.draw(g2);
        BuildingReflection building2Part2Reflection=new BuildingReflection(150,410,150,320);
        building2Part2Reflection.draw(g2);
        BuildingReflection building2Part3Reflection=new BuildingReflection(300,410,25,300);
        building2Part3Reflection.draw(g2);
        
        Building building2Part1=new Building(125,180,25,300);
        building2Part1.draw(g2);
        Building building2Part2=new Building(150,160,150,320);
        building2Part2.draw(g2);
        Building building2Part3=new Building(300,180,25,300);
        building2Part3.draw(g2);
        
        BuildingReflection building3Reflection=new BuildingReflection(325,380,60,390);
        building3Reflection.draw(g2);
        TriangleReflection building3TriangleReflection=new TriangleReflection(325,770,60,60);
        building3TriangleReflection.draw(g);
        
        Building building3=new Building(325,90,60,390);
        building3.draw(g2);
        Triangle building3Triangle=new Triangle(325,90,60,60);
        building3Triangle.draw(g);
        
        BuildingReflection building4Reflection=new BuildingReflection(360,410,100, 280);
        building4Reflection.draw(g2);
        
        Building building4=new Building(360,200,100, 280);
        building4.draw(g2);
        
        BuildingReflection building5Part1Reflection=new BuildingReflection(460,410,180,230);
        building5Part1Reflection.draw(g2);
        BuildingReflection building5Part2Reflection=new BuildingReflection(479,640,140,120);
        building5Part2Reflection.draw(g2);
        BuildingReflection building5Part3Reflection=new BuildingReflection(510,760,80,80);
        building5Part3Reflection.draw(g2);
        BuildingReflection building5Part4Reflection=new BuildingReflection(530,800,10,50);
        building5Part4Reflection.draw(g2);
        BuildingReflection building5Part5Reflection=new BuildingReflection(555,800,10,50);
        building5Part5Reflection.draw(g2);
    
        Building building5Part1=new Building(460,250,180,230);
        building5Part1.draw(g2);
        Building building5Part2=new Building(475,130,140,120);
        building5Part2.draw(g2);
        Building building5Part3=new Building(507,50,80,80);
        building5Part3.draw(g2);
        Building building5Part4=new Building(530,0,10,50);
        building5Part4.draw(g2);
        Building building5Part5=new Building(555,0,10,50);
        building5Part5.draw(g2);
        
        BuildingReflection building6Part1Reflection=new BuildingReflection(640,410,180,170);
        building6Part1Reflection.draw(g2);
        BuildingReflection building6Part2Reflection=new BuildingReflection(675,580,120,120);
        building6Part2Reflection.draw(g2);
        BuildingReflection building6Part3Reflection=new BuildingReflection(690,700,90,70);
        building6Part3Reflection.draw(g2);
        
        Building building6Part1=new Building(640,310,180,170);
        building6Part1.draw(g2);
        Building building6Part2=new Building(665,190,120,120);
        building6Part2.draw(g2);
        Building building6Part3=new Building(680,120,90,70);
        building6Part3.draw(g2);
        
        LineReflection leftPillarReflection=new LineReflection (1020,745, 950, 475, 15);
        leftPillarReflection.draw(g2);
        LineReflection bottomPillarReflection=new LineReflection (950,475, 1090, 475, 15);
        bottomPillarReflection.draw(g2);
        LineReflection rightPillarReflection=new LineReflection (1020,745, 1090, 475, 15);
        rightPillarReflection.draw(g2);
        
        Line leftPillar=new Line (1020,265, 950, 475, 15);
        leftPillar.draw(g2);
        Line bottomPillar=new Line (950,475, 1090, 475, 15);
        bottomPillar.draw(g2);
        Line rightPillar=new Line (1020,265, 1090, 475, 15);
        rightPillar.draw(g2);
        
        LineReflection line1Reflection=new LineReflection (1020, 550, 1020, 905, 7);
        line1Reflection.draw(g2);
        LineReflection line2Reflection=new LineReflection (845, 735, 1200, 735, 7);
        line2Reflection.draw(g2);
        LineReflection line3Reflection=new LineReflection (1110, 850, 890, 610, 7);
        line3Reflection.draw(g2);
        LineReflection line4Reflection=new LineReflection (900, 840, 1168, 622, 7);
        line4Reflection.draw(g2);
        
        Line line1=new Line (1020, 70, 1020, 425, 7);
        line1.draw(g2);
        Line line2=new Line (845, 255, 1200, 255, 7);
        line2.draw(g2);
        Line line3=new Line (1152, 130, 900, 375, 7);
        line3.draw(g2);
        Line line4=new Line (890, 126, 1143, 378, 7);
        line4.draw(g2);
        
        BuildingReflection car1Reflection=new BuildingReflection(1000,530,40,40);
        car1Reflection.draw(g2);
        BuildingReflection car2Reflection=new BuildingReflection(825,715,40,40);
        car2Reflection.draw(g2);
        BuildingReflection car3Reflection=new BuildingReflection(1180,715,40,40);
        car3Reflection.draw(g2);
        BuildingReflection car4Reflection=new BuildingReflection(870,590,40,40);
        car4Reflection.draw(g2);
        BuildingReflection car5Reflection=new BuildingReflection(1148,602,40,40);
        car5Reflection.draw(g2);
        
        Building car1=new Building(1000,50,40,40);
        car1.draw(g2);
        Building car2=new Building(1000,405,40,40);
        car2.draw(g2);
        Building car3=new Building(825,235,40,40);
        car3.draw(g2);
        Building car4=new Building(1180,235,40,40);
        car4.draw(g2);
        Building car5=new Building(1132,110,40,40);
        car5.draw(g2);
        Building car6=new Building(880,355,40,40);
        car6.draw(g2);
        Building car7=new Building(870,106,40,40);
        car7.draw(g2);
        Building car8=new Building(1123,358,40,40);
        car8.draw(g2);
        
        CircleReflection wheelCenterReflection=new CircleReflection(10,1000,720);
        wheelCenterReflection.draw(g2);
        
        Circle wheelCenter=new Circle(10,1000,240);
        wheelCenter.draw(g2);
    }
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
       // ...
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        
    }

}
