import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {

        /*
         * Análise do problema: todas variavéis serão utilizadas
         * Entradas: x1, y1, x2, y2
         * Saída: distancia
         * Processos: distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1))
         * Fluxograma:
         * "C:\Users\escholl\OneDrive - FURB\Documentos\FURB\IP\U2\Exe12.drawio"
         * Testes:
         * x1 | 2 | 30 | 40 |
         * y1 | -2 | 2 | 2 |
         * x2 | 1 | 5 | 5 |
         * y2 | 1 | 1 | 1 |
         * distancia | 3,1623 | 25,0200 | 25,0143 |
         */

        Scanner scr = new Scanner(System.in);

        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double distancia = 0.0;

        System.out.println("Insira o valor do primeiro ponto x");
        x1 = scr.nextInt();

        System.out.println("Insira o valor do primeiro ponto y");
        y1 = scr.nextInt();

        System.out.println("Insira o valor do segundo ponto x");
        x2 = scr.nextInt();

        System.out.println("Insira o valor do segundo ponto y");
        y2 = scr.nextInt();

        System.out.printf("A diferença entre dois pontos do plano cartesiano é de %.4f", distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        scr.close();
    }
}