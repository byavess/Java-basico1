package vetoresArrays;

public class Arrays {
    public static void main(String[] args) {


        //digita a variavel + [] a posiçao e atribuir valores
    double[] temperaturas = new double[365]; // informar quant da lista vai ser necessario
    temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 31.1;
        System.out.println(" valor da temperatura do dia 1 é:" + temperaturas[4]);
        System.out.println(" O tamanho do array: " + temperaturas.length);
        System.out.println("Vaores do array: "+ temperaturas); // aponta pro endereço de memoria
        //pra pegar todos os valores do array
        //versão padrão do for
        for(int i=0; i<temperaturas.length;i++){
            System.out.println("O Valor da temperatura do dia " + (i+1)+ "é " + temperaturas[i]);
        }
        //versão melhorada do for
        for (double temp: temperaturas){
            System.out.println(temp);
        }
    }
}
