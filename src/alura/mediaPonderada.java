import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double somaNota = 0;
        int cargaHoraria = 0;
        int somaCargaHoraria = 0;


        while (nota != -1) {

            System.out.println("Digite a nota: ");
            nota = scanner.nextDouble();

            System.out.println("Digite a carga horária: ");
            cargaHoraria = scanner.nextInt();

            somaNota += (nota * cargaHoraria);
            somaCargaHoraria += cargaHoraria;
        }

        double media = (somaNota)/somaCargaHoraria;
        System.out.println(String.format("Seu coeficiente é %.2f", media));
    }
}
