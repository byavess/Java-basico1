package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com um numero1 : ");
        int numero1 = scan.nextInt();
        System.out.println("o primeiro numero digitado foi : " + numero1);

        System.out.println("Entre com o segundo numero : ");
        int numero2 = scan.nextInt();
        System.out.println("o segundo numero digitado foi : " + numero2);

        int numero3 = numero1 + numero2;
        System.out.println("Então temos: numero1 + numero2 igual a :"+ numero3);

    }
}
