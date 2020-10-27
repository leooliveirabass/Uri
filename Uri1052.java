import java.util.Scanner;

public class Uri1052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();
        String resp = "";
        if(mes == 1) resp += "January";
        else if(mes == 2) resp += "February";
        else if(mes == 3) resp += "March";
        else if(mes == 4) resp += "April";
        else if(mes == 5) resp += "May";
        else if(mes == 6) resp += "June";
        else if(mes == 7) resp += "July";
        else if(mes == 8) resp += "August";
        else if(mes == 9) resp += "September";
        else if(mes == 10) resp += "October";
        else if(mes == 11) resp += "November";
        else resp += "December";

        System.out.println(resp);

    }
}
