public class Question6
{
    public static void main (String[]args)
    {
       int level = 100;
       System.out.println("The water level is "+level+" litres.");
       String msg = (level >= 1000)?"WARNING: Water level has reached 1000L or more!":("Status: Normal.");
       System.out.println(msg);
    }
}