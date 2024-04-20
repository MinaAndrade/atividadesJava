public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes = 0;
    int numAvaliacoes = 0;

    void exibirFichaTecnica() {
        String fichaTecnica = """
                ***** FICHA TÉCNICA DA MÚSICA *****
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                Avaliação: %.2f
                """.formatted(titulo, artista, anoLancamento, calcularMediaAvaliacoes());
        System.out.println(fichaTecnica);
    }

    void avaliarMusica(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double calcularMediaAvaliacoes() {
        return somaAvaliacoes / numAvaliacoes;
    }
}
