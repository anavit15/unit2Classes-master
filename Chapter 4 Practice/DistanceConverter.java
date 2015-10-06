public class DistanceConverter
{
     public static final double FEET_IN_YARD = 3;
     public static final double INCHES_PER_FOOT = 12;
    public static void main(String[] args)
    {
       
        double yards = 3.5;
        double feet = yards * FEET_IN_YARD;
        double inches = feet * INCHES_PER_FOOT;
        System.out.println(yards + " yards are " + feet + " feet");
        System.out.println(yards + " yards are " + inches + " inches");
    }
}