import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();
        float x1 = 0, x2 = 0;
        float delta =  (float) (Math.pow(b, 2) - 4 * a * c);
        
        if (delta > 0 && a != 0) {
            x1 = (float) ((- b + Math.sqrt(delta) ) / (2 * a));
            x2 = (float) ((- b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
