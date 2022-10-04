package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exConvencaoMetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a quantidade de metros");
        double metros = scan.nextDouble();
        double cm = metros * 100;

        System.out.println(metros + "  e igual a "+cm+"cm");

    }
}
