package OrientObjto;

public class testeLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.modelo="A60";
        lampada.tensao = "bivolt";
        lampada.garantia= 36;
        lampada.potencia= 7;
        lampada.cor = "amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "lampeões";


    }
}
