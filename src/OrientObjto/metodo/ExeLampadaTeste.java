package OrientObjto.metodo;

public class ExeLampadaTeste {
    public static void main(String[] args) {
        ExeLampada lampada = new ExeLampada();

        lampada.ligar();
        System.out.println("lampada está Ligada ? " + transformaBollean(lampada.estado));

//        lampada.desligada();
//        System.out.println("lampada esta Ligada? "+ lampada.estado);


        if ( lampada.estado == true){
            System.out.println("lampada ligada");
        }else {
            System.out.println("lampada desligada");
        }

      }
    public static String transformaBollean(Boolean valor){
        String valorAlterado;
        if (valor == true){
            valorAlterado = "SIM";
        }else {
            valorAlterado = "NÃO";
        }
        return valorAlterado;
    }
}
