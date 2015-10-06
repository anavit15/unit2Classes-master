import java.util.Scanner;
public class Number
{
    
    public static void main(String[] args)
    {
        System.out.println("Choose a number between 1,000 and 999,999: ");
        Scanner s= new Scanner(System.in);
        String str=s.next();
        String part2=str.substring(str.length()-3,str.length());
        String part1=str.substring(0,str.length()-4);
        System.out.println(part1+part2);
    }
}