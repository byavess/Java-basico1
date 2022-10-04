package If_Else;

import java.util.Scanner;

public class leituraDeNotas {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        System.out.println("entre com a primeira nota");
        double nota1 = scan.nextDouble();


        System.out.println("entre com a segunda nota");
        double nota2 = scan.nextDouble();




        double media = (nota1 + nota2) / 2;
        if ( media >= 7 ) {
            System.out.println("Aprovado!"+media);
        }
        else if ( media < 7) {
            System.out.println("Reprovado!"+media);
        }
    }
}
