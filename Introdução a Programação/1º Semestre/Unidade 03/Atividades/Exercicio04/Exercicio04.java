import java.util.Scanner;

public class Exercicio04 {

    //Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
    //Entradas: nota1, nota2, nota3
    //processo: media = nota1, nota2, nota3
    //saidas: media

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        float media;

        System.out.println("escreva as notas do aluno");
        float nota1 = scr.nextInt();
        float nota2 = scr.nextInt();
        float nota3 = scr.nextInt();

        media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;

        System.out.println("A media do aluno é: " + media);

        scr.close();
    }
}
