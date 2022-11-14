package PackageAula35Recursivos;

public class Recurssividade {
    //metodo que chama ele mesmo, porem deve ser definidio o ponto de parada.
    //fatorial >>5!= 5*4*3*2*1=
    public int caluculadoraFatorial(int num) {
        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }
        return total;
    }

    public int fatorial(int num) {
        if (num == 0) {  //pont de parada
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
