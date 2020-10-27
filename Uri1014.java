import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double y = in.nextDouble();
        in.close();
        
        double resp = x / y;
        
        System.out.printf("%.3f km/l\n", resp);
    }
}
