package PackageAula13OperadoresAritimeticos;

public class curtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false ;
        boolean resultado1 = verdadeiro & falso;
        boolean resultado2 = verdadeiro && falso;//curto circuito
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
