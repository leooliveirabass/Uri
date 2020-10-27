import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int qtd = in.nextInt();
        float v = in.nextFloat();
        in.close();
        float salary = v * qtd;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salary);
        System.out.println("");
    }
}
