import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] val = new double[6];
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            val[i] = in.nextDouble();
            if (val[i] > 0) count++;
        }
        System.out.println(count + " valores positivos");
    }
}
