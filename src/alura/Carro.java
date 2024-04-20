public class Carro {
    String modelo;
    String marca;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        String fichaTecnica = """
                ***** FICHA TÉCNICA DO VEÍCULO *****
                Modelo: %s
                Marca: %s
                Ano: %d
                Cor: %s 
                """.formatted(modelo, marca, ano, cor);
        System.out.println(fichaTecnica);
    }

    int calcularIdade() {
        return 2024 - ano;
    }
}
