import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 1;
        int chute = 0;

        while (chute < 5) {
            System.out.println("Digite seu chute de 1 a 100: ");
            chute = leitura.nextInt();

            if (chute == numeroSecreto){
                System.out.println(String.format("Parabéns, você acertou o número secreto %d em %d tentativas", numeroSecreto, tentativas));
                break;
            } else if (numeroSecreto > chute) {
                System.out.println("O numero secreto é maior");
            } else {
                System.out.println("O numero secreto é menor");
            }
            tentativas++;
        }

        if (tentativas == 5 && chute != numeroSecreto){
            System.out.println("Você perdeu! O número secreto era " + numeroSecreto);
        }
    }
}
