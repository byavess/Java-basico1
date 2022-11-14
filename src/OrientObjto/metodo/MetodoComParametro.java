package OrientObjto.metodo;

public class MetodoComParametro {
    static String marca;
    static String modelo;
    static int numPassageiros;
    static double capCombustivel;
    static double consumoCombustivel;

    // void delcaração do metodo a principio metodo simples
    void exibirAutonomia(){
        System.out.println(" A autonomia do carro é: "+ capCombustivel * consumoCombustivel+ " KM");
    }
    // utiliza retur que e uma ação pro metodo poder retornar

    double obterAutonomia() {
        System.out.println("metodo obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;

    }
    double calcularCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
