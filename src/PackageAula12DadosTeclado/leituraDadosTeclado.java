package PackageAula12DadosTeclado;

import java.util.Scanner;

public class leituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scanABC = new Scanner(System.in);
        /*//linha completa
        System.out.println("digite seu nome completo: ");
        String nomeCompleto = scanABC.nextLine();
        System.out.println("seu nome completo é : " + nomeCompleto);

        // parte da linhha
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanABC.next();
        System.out.println("Seu primeiro nome é: "+ primeiroNome);

        System.out.println("Digite a sua idade: ");
      //  int idade = scanABC.nextInt();
       // System.out.println("Sua idade é : " +idade);

        System.out.println("digite sua altura:");
        double altura = scanABC.nextDouble();
        System.out.println("A sua altura é :" + altura);*/
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos , altura , e se tem bichinho de estimação");


        String primeiroNome = scanABC.next();
        int idade = scanABC.nextInt();
        byte qtdFilhos = scanABC.nextByte();
        float altura = scanABC.nextFloat();
        boolean tempPet = scanABC.nextBoolean();

// tudo na mesa linha
        System.out.println("voce digitou os seguintes valores : ");
        System.out.println("Primeiro nome: "+primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("quantidade de filhos: " + qtdFilhos);
        System.out.println( "Altura: "+ altura );
        System.out.println("Tem bichinho de estimação? " + tempPet);


    }
}
