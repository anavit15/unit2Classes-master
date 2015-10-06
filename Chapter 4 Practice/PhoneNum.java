import java.util.Scanner;
public class PhoneNum
{
    
    public static void main(String[] args)
    {
        System.out.println("Provide a ten digit number: ");
        Scanner s= new Scanner(System.in);
        String str=s.next();
        String part1=str.substring(0,3);
        String part2=str.substring(3,6);
        String part3=str.substring(6,9);
        System.out.println("(" + part1 +") "+part2 + "-" + part3);
    }
}