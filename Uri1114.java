import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senhaValida = 2002;
        int senha = in.nextInt();
        while(senhaValida != senha) {
            System.out.println("Senha Invalida");
            senha = in.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
