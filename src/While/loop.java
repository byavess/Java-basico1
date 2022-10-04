package While;

public class loop {
    public static void main(String[] args) {

        int i = 1; // cout ou cont ... mas o mais ultilizado e o i
        int max = 10;
        System.out.println( "contando até: " + max);
// enquanto for verdadeiro continua executando
        while (i <= max ) { //primeiro avalia a expressão se for verdaderia execulta o bloco de codico
            System.out.println("valor de i:" + i);
            i++; // i = i +1; ou i+=1; e a mesma coisa, o mais usando e o i++
        }
        System.out.println(i); // valor de 11
        do {//caso seja falso não volta
            i++;
            System.out.println("valor de i: " + i);
        } while (i < 11); //apartir daqui  ja vira 12
        System.out.println(i);
    }
}
