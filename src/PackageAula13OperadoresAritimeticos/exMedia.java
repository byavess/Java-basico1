package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("digite a seugunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("digite a quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("sua media é: "+ media);



    }
}
