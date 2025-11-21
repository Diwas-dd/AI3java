package Workshop3;
import java.util.Scanner;

public class Ques2
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