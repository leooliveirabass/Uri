import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio = in.nextDouble();
        in.close();
        double n = 3.14159;
        double area = n * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f", area);
        System.out.println("");
    }
}
