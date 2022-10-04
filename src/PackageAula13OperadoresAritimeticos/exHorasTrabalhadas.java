package PackageAula13OperadoresAritimeticos;

import java.util.Scanner;

public class exHorasTrabalhadas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? : ");
        double ganhoHr = scan.nextDouble();

        System.out.println("quantas horas trabalha no mês? : ");

        double horasMes = scan.nextDouble();
        System.out.println("você faturou esse mês o valor de:R$ "+ ganhoHr * horasMes);

    }
}
