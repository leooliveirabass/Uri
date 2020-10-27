import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        in.close();
        int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
