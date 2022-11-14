package OrientObjto.metodo;

public class metodoComRetornoTeste {
    public static void main(String[] args) {
        metodoComRetorno retornoMetodo = new metodoComRetorno();
        retornoMetodo.marca = "fiat";
        retornoMetodo.modelo = "Ducato";
        retornoMetodo.numPassageiros = 10;
        retornoMetodo.capCombustivel=200;
        retornoMetodo.consumoCombustivel = 0.2;
        System.out.println(retornoMetodo.marca);
        System.out.println(retornoMetodo.modelo);

        retornoMetodo.exibirAutonomia();

        double autonomia = retornoMetodo.obterAutonomia();
        System.out.println("A autonomia o carro é : " + autonomia);
        System.out.println("A autonomia do carro e : "+ retornoMetodo.obterAutonomia());

    }
}
