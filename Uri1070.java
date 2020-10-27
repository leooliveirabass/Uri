import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int impar = 0;
        while(impar < 6) {
            if (num%2 != 0) {
                System.out.println(num);
                impar++;
            }
            num++;
        }
    }
}
