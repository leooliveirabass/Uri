import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod = in.nextInt();
        int qtd = in.nextInt();
        double tot;

        if(cod == 1 ) tot = qtd * 4;
        else if(cod == 2 ) tot = qtd * 4.5;
        else if(cod == 3 ) tot = qtd * 5;
        else if(cod == 4 ) tot = qtd * 2;
        else tot = qtd * 1.5;

        System.out.printf("Total: R$ %.2f\n", tot);
    }
}
