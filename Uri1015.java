import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        in.close();
        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        double dist = Math.sqrt(a + b);
        System.out.printf("%.4f\n", dist);
    }
}
