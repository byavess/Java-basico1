package ArraysBiDerecionais1;

import java.util.Random;

public class criaColunaMaiorValor {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random();

        for (int i=0; i<numerosAleatorios.length; i++) {
            for (int j=0; j<numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i<numerosAleatorios.length; i++) {
        for (int j = 0; j<numerosAleatorios.length; j++) {
            if (numerosAleatorios[i][j] > maior) {
                maior = numerosAleatorios[i][j];
                linha = i;
                col = j;
            }
        }

    }
        for (int i=0; i<numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.println(numerosAleatorios[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("linha = "+linha);
        System.out.println("coluna = "+ col);

}
}
//sempre que ultiliza arrays temos que usar um for (int i=0; i<xxx.length; i++){ (sout[i])}