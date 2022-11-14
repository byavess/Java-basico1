import java.util.Scanner;

public class testeTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Digite o primeiro numero: ");
//        int numero1 = scan.nextInt();
//        System.out.println("o numero digitado foi: " + numero1);
//        System.out.println("");
//        System.out.println("Digite o segundo numero: ");
//        int numero2 = scan.nextInt();
//        System.out.println(" o numero digitado foi: " + numero2);
//        switch (numero1) {//so mudar para if
//            case 1:// aqui else if
//                System.out.println(" O maior numero digitado foi o:");
//
//
//            case 2:
//                System.out.println(" O maior numero digitado foi: " + numero1);
//
//        }

         int [] vetorA = new int[10];
         int [] vetorB = new int [vetorA.length];

         for (int i=0; i<vetorA.length; i++) {
             System.out.println("Entre com o valor da posição: " + i);
             vetorA[i] = scan.nextInt();
             vetorB[i] = vetorA[i] % 2;
         }
        System.out.println("vetor A = ");
         for (int i=0; i<vetorA.length; i++) {

         }
    }




}




