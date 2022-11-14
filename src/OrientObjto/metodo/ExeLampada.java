package OrientObjto.metodo;

public class ExeLampada {
    String modelo;
    String tensao;
    int potecia;
    String cor;
    String tipoLuz;
    int garantia;
    String[] tipos;
    boolean tipoAbajur;

    boolean estado;

    void ligar() {
        estado = true;
    }

    void desligada() {
        estado = false;
    }


}
