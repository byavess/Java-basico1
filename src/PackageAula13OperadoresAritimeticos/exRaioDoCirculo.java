package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exRaioDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("entre com o raio do circulo: ");

        double raio = scan.nextDouble();
        //Math um atribuicão do proprio java pra ajudar nos caulculos
        double area = Math.PI * Math.pow (raio, 2);
        System.out.println("A área do círculo é: " +area);
    }
}
