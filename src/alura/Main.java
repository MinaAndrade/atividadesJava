public class Main {
    public static void main(String[] args) {
        //Atv 1
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        //Atv 2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println("O dobro é " + resultado);

        //Atv 3
        Musica musica = new Musica();

        musica.titulo = "Last Kiss";
        musica.artista = "Pearl Jam";
        musica.anoLancamento = 2004;

        musica.avaliarMusica(9.5);
        musica.avaliarMusica(8.8);
        musica.avaliarMusica(9.3);

        musica.calcularMediaAvaliacoes();
        musica.exibirFichaTecnica();

        //Atv 4
        Carro carro = new Carro();

        carro.modelo = "fiesta";
        carro.marca = "ford";
        carro.ano = 2012;
        carro.cor = "vermelho";

        carro.exibirFichaTecnica();
        int resultadoIdade = carro.calcularIdade();
        System.out.println("O carro tem " + resultadoIdade + " anos");

        //Atv 5
        Aluno aluno = new Aluno();
        aluno.nome = "Yasmina";
        aluno.idade = 33;
        aluno.curso = "Sistemas da Informação";
        aluno.periodo = 5;
        aluno.anoFormacao = 2025;

        aluno.exibirInformacoes();
    }
}