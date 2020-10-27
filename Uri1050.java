import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ddd = in.nextInt();
        in.close();
        String resp = "";
        if(ddd == 61) resp += "Brasilia";
        else if(ddd == 71) resp += "Salvador";
        else if(ddd == 11) resp += "Sao Paulo";
        else if(ddd == 21) resp += "Rio de Janeiro";
        else if(ddd == 32) resp += "Juiz de Fora";
        else if(ddd == 19) resp += "Campinas";
        else if(ddd == 27) resp += "Vitoria";
        else if(ddd == 31) resp += "Belo Horizonte";
        else resp += "DDD nao cadastrado";

        System.out.println(resp);
    }
}
