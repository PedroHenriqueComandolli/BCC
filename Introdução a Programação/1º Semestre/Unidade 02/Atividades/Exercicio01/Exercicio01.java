import java.util.Scanner;

public class Exercicio01 {

    //Analise do problema: o nome não é utilizado
    //Entredas: n1, n2, n3, nome
    //Saida: media
    //Processo: media = (n1 + n2 + n3) / 3
    //Teste:
    //n1    | 9 | 9 | 8 |
    //n2    | 9 | 4 | 9 |
    //n3    | 9 | 5 | 7 |
    //media | 9 | 6 | 8 |


    //faça um algoritmo que calcule a media das notas
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Bom dia");
        System.out.println("Mensagem 2");
        System.out.println("Mensagem 3");

        System.out.println("Digite nota 1: ");
        float nota1 = leitor.nextFloat();
        System.out.println("Digite nota 2: ");
        float nota2 = leitor.nextFloat();
        System.out.println("Digite nota 3: ");
        float nota3 = leitor.nextFloat();
        System.out.println("Digite o nome: ");
        String nome= leitor.next();

        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media das notas de " + nome + " é: " + media);

        leitor.close();
    }
}
