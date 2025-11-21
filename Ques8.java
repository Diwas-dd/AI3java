import java.util.Scanner;

/**
 * Write a description of class Ques8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ques8
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstnum = sc.nextInt();
        System.out.println("Enter the second number");
        int secondnum = sc.nextInt();      
        System.out.println("Enter the third number");
        int thirdnum = sc.nextInt();
        var bigger = (firstnum>secondnum)?firstnum:secondnum ;
        var biggest = (bigger>thirdnum)?bigger:thirdnum;
        System.out.println(biggest+" is the greatest number");
    }
}