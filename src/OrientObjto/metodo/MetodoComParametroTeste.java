package OrientObjto.metodo;

public class MetodoComParametroTeste {
    public static void main(String[] args) {
        MetodoComParametro parametroMetodo = new MetodoComParametro();
        parametroMetodo.marca = "fiat";
        parametroMetodo.modelo = "Ducato";
        parametroMetodo.numPassageiros = 10;
        parametroMetodo.capCombustivel=200;
        parametroMetodo.consumoCombustivel = 0.2;
        System.out.println(parametroMetodo.marca);
        System.out.println(parametroMetodo.modelo);

        parametroMetodo.exibirAutonomia();

        double autonomia = parametroMetodo.obterAutonomia();
        System.out.println("A autonomia o carro é : " + autonomia);
        System.out.println("A autonomia do carro e : "+ parametroMetodo.obterAutonomia());

        double qtdCombustivel10 = parametroMetodo.calcularCombustivel(10);
        double qtdCombustivel15 = parametroMetodo.calcularCombustivel(15);
        double qtdCombustivel20 = parametroMetodo.calcularCombustivel(20);
        System.out.println("qtdCombustivel10: "+ qtdCombustivel10);
        System.out.println("qtdCombustivel15: "+ qtdCombustivel15);
        System.out.println("qtdCombustivel20: "+ qtdCombustivel20);

    }

}
