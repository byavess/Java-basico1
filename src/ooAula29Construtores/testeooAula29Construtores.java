package ooAula29Construtores;

import OrientObjto.Carro;

public class testeooAula29Construtores {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.consumoCombustivel= 0.2;

        System.out.println(van.numPassageiro);
    }
}
