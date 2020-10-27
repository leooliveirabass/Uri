import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = in.next();
        double fixo = in.nextDouble();
        double vendas = in.nextDouble();
        in.close();
        double total = fixo + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println("");
    }
}
