import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        int cardNumber = input.nextInt();

        if (mod10(cardNumber)) 
            System.out.println(cardNumber + " is valid.");
        else
            System.out.println(cardNumber + " is invalid.");

    }  


    public static boolean mod10(int cardNumber) {
        int length = String.valueOf(cardNumber).length();
        System.out.println("Length is " + length);
        if (length == 16)
            return true;
        else   
            return false;
    }
}