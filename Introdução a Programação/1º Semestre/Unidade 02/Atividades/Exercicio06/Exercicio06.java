import java.util.Scanner;

public class Exercicio06 {

    //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
    //A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    //Analise: Tudo certo.
    //Entredas: NF, NHT, VH
    //Saida: NF, Salario
    //Processo:  Salario = NHT * VH
    //Teste:
    //NHT           | 5  | 2  |
    //VH            | 2  | 5  |
    //multiplicação | 10 | 10 |


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o numero do funcionario: ");
        int NF = leitor.nextInt();
        System.out.println("Informe o valor ganhado por hora: ");
        float VH = leitor.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int NHT = leitor.nextInt();
    
        float Salario = VH * NHT;

        System.out.println("O numero do funcionario é: " + NF + " e o salario do funcionario é " + Salario);

        leitor.close();
    }
}
