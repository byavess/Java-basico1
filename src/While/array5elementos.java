package While;

import java.util.Arrays;

public class array5elementos {
    public static void main(String[] args) {

//        String[] vetorA = new String[5];
//        vetorA[0] = "teste";
//        vetorA[1] = "teste1";
//        vetorA[2] = "teste2";
//        vetorA[3] = "teste3";
//        vetorA[4] = "teste4";
//
//        String vetorB[] = vetorA;
//        for (String vetor : vetorB){
//
//            System.out.println(vetor);
//        }
//        System.out.println("quantidade de elementos "+ vetorB.length);


        int[] listaNumeros = new int[8];

        listaNumeros[0] = 5;
        listaNumeros[1] = 6;
        listaNumeros[2] = 85;
        listaNumeros[3] = 35;
        listaNumeros[4] = 53;
        listaNumeros[5] = 25;
        listaNumeros[6] = 52;
        listaNumeros[7] = 51;

//        int[] vetor2 = Arrays.stream(listaNumeros).map( num -> num * 2).toArray();
//
//
//        Arrays.stream(vetor2).forEach(System.out::println);
////
//
//        int mult = 0;
//        for (var num :listaNumeros ) {
//            mult = num * 2;
//        }
//        //3 formas de fazer for imprimir
//        for (var num :listaNumeros ) {
//            System.out.println(num);
//        }
//
//        for (int num=0 ; num<listaNumeros.length; num++){
//            System.out.println(num);
//        }
 // Stream API
        Arrays.stream(listaNumeros)
                .filter( num -> num > 50)
                .map(num -> num * 2)
                .forEach(System.out::println);
//
//        int[] listaNumeros2 = new int[mult];

       // System.out.println(listaNumeros2);


    }

}
