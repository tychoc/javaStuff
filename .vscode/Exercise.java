// Write your imports here if needed

public class Exercise {
    public static void main(String[] args) {
        //System.out.printf("%-12s %s\n", "i", "m(i)");
    
        System.out.printf("%-6s %s\n", "i", "m(i)");


        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-6s %.4f\n", i, m(i));
        }
    }
    
    public static double m(int i) {
        double sum = 0.0;
        for (int k = 1; k <= i; k++) {
            sum += k / (k + 1.0);
        }
        return sum;
    }
  
}
