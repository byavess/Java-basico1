package ooAula29Construtores;

public class ooConstrutores {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;



//    void Carro(){
//        System.out.println("Classe carro foi estanciada");
//    }
    void exibirAtuonomia(){
        System.out.println("A autonomia do carro é:  "+ capCombustivel * consumoCombustivel);
    }
    double obterAutonomia(){
        System.out.println("Metodo ObterAutonomia ofi chamado.");
        return capCombustivel * consumoCombustivel;

    }
    double caulcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
