import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        double distancia = b * a;
        double resp = distancia / 12;
        
        System.out.printf("%.3f\n", resp);
    }
}
