import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        in.close();
        double pi = 3.14159;
        double volume = (4/3.0) * pi * Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println("");
    }
}
