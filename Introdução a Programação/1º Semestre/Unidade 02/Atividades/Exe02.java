import java.util.Scanner;

public class Exe02 {

    //Leia 2 valores inteiros e imprima sua multiplicação.
    //Analise: Tudo certo.
    //Entredas: n1, n2
    //Saida: resultado
    //Processo: resultado = n1 * n2
    //Teste:
    //n1            | 5  | 2  |
    //n1            | 2  | 5  |
    //multiplicação | 10 | 10 |

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        int nota1 = leitor.nextInt();
        System.out.println("Informe a nota 2: ");
        int nota2 = leitor.nextInt();
        
        int resultado = nota1 * nota2;

        System.out.println("A multiplicação das notas é: " + resultado);

        leitor.close();

    }
}
