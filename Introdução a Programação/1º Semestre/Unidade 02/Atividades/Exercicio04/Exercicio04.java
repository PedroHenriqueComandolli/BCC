import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        
        /*
         * Análise do problema: todas variavéis serão utilizadas
         * Entradas: nA, nB
         * Saída: media
         * Processos: media = (nA * 3.5 + nB * 7.5) / 11
         * Fluxograma: "C:\Users\escholl\OneDrive - FURB\Documentos\FURB\IP\U2\Exe04.drawio"
         * Testes:
         * nA | 10 | 7,7 | 6 |
         * nB | 10 | 6,5 | 9 |
         * media | 10 | 6,88 | 8,05 |
         */

        Scanner scr = new Scanner(System.in);

        double nA = 0.0, nB = 0.0, media = 0.0;

        System.out.println("Insira a primeira nota");
        nA = scr.nextDouble();

        System.out.println("Insira a segunda nota");
        nB = scr.nextDouble();

        System.out.printf("A média ponderada das notas é %.2f", media = (nA * 3.5 + nB * 7.5) / 11);

        scr.close();
        
    }
}