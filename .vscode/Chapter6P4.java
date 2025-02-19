// Write your imports here if needed
import java.util.Scanner;

public class Chapter6P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter time in milliseconds: ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        
        //long totalSeconds = millis / 1000;
        //long seconds = totalSeconds % 60;
        //long totalMinutes = seconds / 60;
        //long minutes = totalMinutes % 60;
        //long totalHours = minutes / 60;
        //long hours = totalHours % 60;
        long seconds = (millis / 1000) % 60;
        long minutes = (millis / (1000 * 60)) % 60;
        long hours = (millis / (1000 * 60 * 60));
        String time = hours + ":" + minutes + ":" + seconds;

        return time;
    }
    

    
  
}
