import java.security.spec.RSAOtherPrimeInfo;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        double celsius = 36.5;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura convertida é %.1f fahrenheit", fahrenheit);

        System.out.println(mensagem);

        int fahrenheitInteiro = (int) fahrenheit;
        System.out.println("A temperatura em fahrenheit inteira é: " + fahrenheitInteiro);
    }
}
