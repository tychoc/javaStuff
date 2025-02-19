// Write your imports here if needed
import java.util.Scanner;

public class Chapter6P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int width = input.nextInt();

        System.out.print(format(number, width));
    }
    

    public static String format(int number, int width) {
        int numberOfDigits = (number + "").length();

        String result = "";

        for (int i = 1; i <= width - numberOfDigits; i++) {
            result = "0" + result;
        }
    return result + number;
    }
  
}
