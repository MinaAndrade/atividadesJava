import java.util.Scanner;

public class horaPratica2 {
    public static void main(String[] args) {
        /* Atv 1
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        } */

        /*Atv2
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println(String.format("Os número são diferentes. %d é maior que %d", numero1, numero2));
        } else {
            System.out.println(String.format("Os número são diferentes. %d é maior que %d", numero2, numero1));
        }*/

        /*Atv3
        Scanner leitor = new Scanner(System.in);
        String menu = """
                ------ MENU ------
                Digite a opção desejada:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                3. Sair
                """;

        System.out.println(menu);
        int opcao = leitor.nextByte();
        double tamanho;
        double area = 0;

        while (opcao != 3) {
            if (opcao == 1) {
                System.out.println("Digite o lado do quadrado: ");
                tamanho = leitor.nextDouble();
                area = Math.pow(tamanho, 2);
            } else if (opcao == 2) {
                System.out.println("Digite o raio do círculo: ");
                tamanho = leitor.nextDouble();
                area = 3.14 * Math.pow(tamanho, 2);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção Inválida!");
            }
        }
        System.out.println("A área é " + area);*/

        /*Atv 4
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para calcular sua tabuada: ");
        int numero = leitor.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            int resultado = numero * i;
            System.out.println(String.format("%d x %d = %d", numero, i, resultado));
        }*/

        /*Atv5
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println(String.format("O número %d é par", numero));
        } else {
            System.out.println(String.format("O número %d é ímpar", numero));
        }*/

        //Atv6
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *=  i;
        }

        System.out.println(String.format("O fatorial de %d é %d", numero, fatorial));
    }
}
