import java.util.Scanner;

public class Uri2763 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cpf = in.nextLine();
        System.out.println(cpf.substring(0,3));
        System.out.println(cpf.substring(4,7));
        System.out.println(cpf.substring(8,11));
        System.out.println(cpf.substring(12,14));
    }
}
