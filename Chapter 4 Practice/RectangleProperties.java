import java.util.Scanner;
public class RectangleProperties
{
    
    public static void main(String[] args)
    {
        System.out.println("What would you like the length of the rectangle to be: ");
        Scanner s= new Scanner(System.in);
        System.out.println("What would you like the width of the rectangle to be: ");
        Scanner s2= new Scanner(System.in);
        double length = s.nextDouble();
        double width=s.nextDouble();
        double perimeter=2*length+2*width;
        double area=length*width;
        double diagonal=Math.sqrt((length*length)+(width*width));
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);
        System.out.println("Diagonal: "+diagonal);
    }
}