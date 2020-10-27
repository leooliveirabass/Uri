import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, par = 0;
        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            if (num % 2 == 0) par++;
        }
        System.out.println(par + " valores pares");
    }
}
