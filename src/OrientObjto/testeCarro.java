package OrientObjto;

public class testeCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        System.out.println(van.marca);
        System.out.println(van.modelo);

        System.out.println(" ");

        Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.numPassageiro = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);


//teve que declarar atributo publico ou fazer um interface
    }
}
