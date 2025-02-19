// Write your imports here if needed
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.print("Enter a string: ");
        String str = input.nextLine();
        //System.out.print("Enter a character: ");
        //String st = input.next();
        //To do so, read a line, and assign line.charAt(0) to character ch.
        String line = input.next();
        char c = line.charAt(0);
        //char c = input.next().charAt(0);

        //System.out.print(c + " appears in " + str + " " + count(str, c) + " times");
        System.out.print(count(str, c));
    }


    public static int count(String str, char c) {
        int count = 0;
        for (int i = 0; i <= (str.length() - 1); i++) {
            if (str.charAt(i) == c) {
                count++;
                System.out.print("found a letter");
            }
            System.out.println("didn't find a letter, looping");
        }
    return count;
    }

    // Write your code here
  
}
