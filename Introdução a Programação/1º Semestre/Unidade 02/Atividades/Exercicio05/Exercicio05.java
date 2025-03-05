
import java.util.Scanner;

public class Exercicio05 {
    //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
    // do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    // Analise: Tudo certo
    // Entradas: A, B, C, D
    // Saida: Diferenca
    // Processo: A * B - C * D
    //Teste:
    //A         | 9  | 9 | 8 |
    //B         | 8  | 8 | 9 |
    //C         | 8  | 9 | 8 |
    //D         | 9  | 8 | 9 |
    //Diferença | 48 | 0 | 1 |
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Me de valores para A, B, C, D. Respectivamente: ");
        A = src.nextInt();
        B = src.nextInt();
        C = src.nextInt();
        D = src.nextInt();

        int Diferenca = (A * B - C * D);
        System.out.println(Diferenca);

        src.close();
    }
}