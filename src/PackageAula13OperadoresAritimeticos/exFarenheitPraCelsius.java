package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exFarenheitPraCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a temperatura em Farenheit: ");
        double f = scan.nextDouble();
        double c = (5 * (f-32) / 9);
        System.out.println(" A temperatura " +f+ "F e igual a " + c + "c");

    }
}
