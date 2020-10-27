import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double PI = 3.14159;
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        in.close();
        triangulo = (a * c) / 2;
        circulo = PI * Math.pow(c, 2); 
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
