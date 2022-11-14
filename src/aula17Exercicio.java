import java.util.Scanner;

public class aula17Exercicio {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println( "Entre com um nota");
        double nota = scan.nextDouble();
        if (nota >=0 && nota <=10){
            System.out.println("você digitou: "+ nota);
        } else {
            System.out.println("Nota invalido!");
        }

    }
}
