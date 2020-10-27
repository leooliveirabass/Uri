import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] val = new double[6];
        int count = 0;
        double media = 0;
        for (int i = 0; i < val.length; i++) {
            val[i] = in.nextDouble();
            if (val[i] > 0) {
                count+=1;
                media += val[i];
            } 
        } 
        media = media / count;
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}
