package If_Else;

import java.util.Scanner;

public class FemeninoMasculino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra (F ou M): ");
        String input = scan.next();
        if (input.equalsIgnoreCase("f")){
            System.out.println("F-Femenino");
        }
        //equalsIgnoreCase serve pra ingorar o caracter se e maiuscuou ou menusculo
        else if ( input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }
        else {
            System.out.println("sexo invalido");
        }
    }
}
//comparação de estrig não usa o == na verdade ultiliza o equals ou igualsIngorecase