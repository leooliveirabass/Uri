import java.util.Scanner;

public class Uri1172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
            if (vet[i] <= 0) vet[i] = 1;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("X[" + i + "] = " + vet[i]);
        }
 
    }
}
