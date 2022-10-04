package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exAreaDoQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a base, e a aultura, do quadrado: ");
        double base = scan.nextDouble();
        double altura = scan.nextDouble();
        double area = base * altura;
        System.out.println(" area do quadrado é :"+ area);
// pode colocar tbm area * 2 no sout

        double areaTotal = area * 2;
        System.out.println(" A area total é: "+ areaTotal);



    }
}
