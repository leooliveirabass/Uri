import java.util.Scanner;

public class Uri1175 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        for (int i = 0; i < (n.length / 2); i++) {
            int aux = n[i];
            n[i] = n[(n.length - 1 )-i];
            n[(n.length - 1 )-i] = aux;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
