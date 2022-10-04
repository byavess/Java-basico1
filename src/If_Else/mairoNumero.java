package If_Else;
//faça um programa que peça dois numeros e imprima o mairo deles
import java.util.Scanner;

public class mairoNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primerio numero: ");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o seugndo numero: ");
        double segundoNumero = scan.nextDouble();


        if (primeiroNumero > segundoNumero) {
            System.out.println("o numero maior e:" + primeiroNumero);
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("o numero maior e:" + segundoNumero);
        } else {
            System.out.println("numeros iguais!");
        }
    }
}