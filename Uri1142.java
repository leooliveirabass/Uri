import java.util.Scanner;

public class Uri1142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num * 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println("PUM");
        }
    }
}