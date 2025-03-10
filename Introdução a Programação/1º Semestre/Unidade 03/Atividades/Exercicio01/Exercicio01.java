import java.util.Scanner;

public class Exercicio01 {

    //Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
    //Entradas: valor1, valor2
    //processo: resultado = valor1 * valor2
    //saidas: resultado

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int resultado;

        System.out.println("escreva os valores para calcular a area do terreno");
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();

        resultado = valor1 * valor2;

        System.out.println(resultado);

        leitor.close();
    }
}
