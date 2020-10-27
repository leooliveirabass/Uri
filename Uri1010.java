import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        double x3 = in.nextDouble();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        double y3 = in.nextDouble();
        
        
        double total = x2 * x3 + y2 * y3;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
