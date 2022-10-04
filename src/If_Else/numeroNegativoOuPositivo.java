package If_Else;

import java.util.Scanner;

public class numeroNegativoOuPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");


        double numero = scan.nextDouble();

        if(numero >= 0){
            System.out.println("O numero digitado e positivo" + numero);
        }
        else if(numero < 0){
            System.out.println("O numero digitado e negativo" + numero);
        }
        else {
            System.out.println("digito invalido");
        }
    }
}
