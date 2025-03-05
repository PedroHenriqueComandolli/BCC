import java.util.Scanner;

public class Exercicio09 {
    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    //Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.

    // Analise: Não tem o valor da cotação do dólar, então tive que pesquisar.
    // Entradas: valorDol
    // Saida: valorReal
    // Processo: valorDol * cotação (5,78)
    //Teste:
    //valorDol    | 1    | 2     | 3     |
    //valorReal   | 5,78 | 11,56 | 17,34 |
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        float cotação = 5.78f;
        float valorDol, valorReal;

        System.out.println("Qual foi o valor em Dólar?");
        valorDol = src.nextFloat();

        valorReal = valorDol * cotação;

        System.out.println(valorReal);

        src.close();


    }
}