package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class tamnhoDolinkEVelocidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();
        System.out.println("Entre com a velocidade da internet: ");
        double veloInternet = scan.nextDouble();
        double tempo = tamArquivo / veloInternet;
        System.out.println("Tempo de download"+ tempo);
    }
}
