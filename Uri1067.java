import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2 != 0) System.out.println(i);
        }
    }
}
