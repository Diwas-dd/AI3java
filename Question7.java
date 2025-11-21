import java.util.Scanner;

public class Question7
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("For Pharmacist");
        System.out.println("Enter the desired medicine: ");
        String medicineName1 = sc.nextLine(); // Taking input for name of the medicine
        System.out.println("Enter the desired quantity: ");
        int quantity1 = sc.nextInt(); // Taking input for quantity of the medicine
        System.out.println("Enter the price");
        float price = sc.nextFloat();
        
        System.out.println("For Customer");
        sc.nextLine();
        System.out.println("Enter the desired medicine: ");
        String medicineName2 = sc.nextLine();
        System.out.println("Enter the desired quantity: ");
        int quantity2 = sc.nextInt();
        int totalQuantity = quantity1-quantity2;
        float totalPrice = quantity2*price;
        System.out.println("The total price of your medicine is Rs. "+totalPrice);       
    }
}