import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        int resp =  (60 * a) / 30;
        System.out.println(resp + " minutos");
    }
}
