public class Media {
    public static void main(String[] args) {

        //atv 1
        double nota1 = 9.5;
        double nota2 = 8.3;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        //atv2
        int notaInteira = (int) nota1;

        System.out.println("Casting da nota 1 em inteiro: " + notaInteira);

        //atv3
        char letra = 'Y';
        String palavra = "Yasmina";
        String mensagem2 = String.format("A palavra %s começa com a letra %c", palavra, letra);

        System.out.println(mensagem2);

        //atv4
        double precoProduto = 5.99;
        int quantidade = 2;
        double total = precoProduto * quantidade;

        String mensagem = """
                O valor do produto é R$ %.2f
                Quantidade comprada foi %d
                Você terá que pagar R$ %.2f
                """.formatted(precoProduto, quantidade, total);

        System.out.println(mensagem);

        //atv5
        double valorEmDolares = 20.0;
        double taxaDeConversao = 4.95;
        double valorConvertidoEmReais = valorEmDolares * taxaDeConversao;

        System.out.println(String.format("$ %.2f dolares convertido em Real é R$ %.2f reais", valorEmDolares, valorConvertidoEmReais));

        //atv6
        double precoOriginal = 101.95;
        double percentualDesconto = 10;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println(String.format("Preço Original é: %.2f, o valor do desconto é: %.2f, e o novo preço é: %.2f ", precoOriginal, valorDesconto, novoPreco));

    }
}
