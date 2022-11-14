package OrientObjto;

public class livroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Maastering EXtjs";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = "+ livro.nome);
    }
}
