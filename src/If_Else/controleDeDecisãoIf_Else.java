package If_Else;

import java.util.Scanner;

public class controleDeDecisãoIf_Else {
    public static void main(String[] args) {
        boolean temBatata = true;
         int ovos = 6;
         if (temBatata) {
            ovos = 9;
         }
        System.out.println("compre " + ovos + "  ovos.");

         Scanner scan = new Scanner(System.in);
        System.out.println("digite a idade: ");
         int idade = scan.nextInt();
         if (idade >= 18) {
             System.out.println("É maior de idade");
                      }
         else{
             System.out.println("é menor de idade");
         }




        System.out.println("digite o valor do produto: ");
      double produto = scan.nextDouble();
         if( produto <= 10) {
            System.out.println("Barato");
         }
         else if ( produto >10 && produto < 15 ) {
            System.out.println("Pedir Desconto");
        }
         else if ( produto >= 15 && produto <17 ) {
            System.out.println("Pesquisar mais");
        }
         else { //produto >= 17
             System.out.println("Muito Caro!");
         }

    }
}
