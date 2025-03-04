import java.util.Scanner;
public class Exercicio03 {

    //Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
    //Analise do problema: todas as variáveis são utilizadas
    //Entradas: raio
    //Saida: area
    //Processo: area = (raio*raio)* 3.14159
    //Teste:
    //raio   | 3   | 4  | 5   |
    //area   |28.2 |50.2|78.53|

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Raio: ");
        double raio = leitor.nextFloat();
        double area = (raio*raio)*(3.14159);
        System.out.println("O valor da área é: "+area);
        leitor.close();
    }
}