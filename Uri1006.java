import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();
        float media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f", media);
        System.out.println("");
    }
}