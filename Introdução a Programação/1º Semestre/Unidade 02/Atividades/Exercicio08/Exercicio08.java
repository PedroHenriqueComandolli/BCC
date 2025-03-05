import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        /*
         * Análise do problema: os códigos das peças são descessários
         * Entradas: nP1, nP2, vP1, vP2
         * Saída: valor
         * Processos: valor = nP1 * vP1 + nP2 * vP2
         * Fluxograma: "C:\Users\escholl\OneDrive - FURB\Documentos\FURB\IP\U2\Exe08.drawio"
         * Testes:
         * nP1 | 2 | 50 | 5 |
         * nP2 | 2 | 20 | 1 |
         * vP1 | 10 | 400 | 2 |
         * vP2 | 10 | 200 | 6 |
         * valor | 40 | 24000 | 16 | 
         */

        Scanner scr = new Scanner(System.in);

        int nP1 = 0, nP2 = 0;
        double vP1 = 0.0, vP2 = 0.0, valor = 0.0;

        System.out.println("Insira a quantidade da primeira peça");
        nP1 = scr.nextInt();

        System.out.println("Insira o valor unitário da primeira peça");
        vP1 = scr.nextDouble();

        System.out.println("Insira a quantidade da segunda peça");
        nP2 = scr.nextInt();

        System.out.println("Insira o valor unitário da segunda peça");
        vP2 = scr.nextDouble();

        System.out.printf("O valor total a ser pago é de $ %.2f", valor = nP1 * vP1 + nP2 * vP2);

        scr.close();
    }
}