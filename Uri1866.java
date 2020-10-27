import java.util.Scanner;

public class Uri1866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int resp;
        if (n%2 == 0) resp = 0;
        else resp = 1; 
        System.out.println(resp);
    }
}
