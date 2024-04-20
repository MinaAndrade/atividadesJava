public class Aluno {
    String nome;
    int idade;
    String curso;
    int periodo;
    int anoFormacao;

    void exibirInformacoes() {
        String informacao = """
                ***** INFORMAÇÃO DO ALUNO *****
                Nome: %s
                Idade: %d anos
                Curso: %s
                Período: %dº
                Ano da Formação: %d
                """.formatted(nome, idade, curso, periodo, anoFormacao);

        System.out.println(informacao);
    }
}
