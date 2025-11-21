package Workshop3;
import java.util.Scanner;


/**
 * Write a description of class GradeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeCalculator
{
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numeric grade");
            int grade = sc.nextInt();
            String msg = (grade>=40)?"Pass":"Fail";
            System.out.println(msg);
        }
}