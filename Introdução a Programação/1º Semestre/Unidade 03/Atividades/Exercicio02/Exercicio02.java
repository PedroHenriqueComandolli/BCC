import java.util.Scanner;

public class Exercicio02 {

    //Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos 
    //e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
    //O valor do desconto é de R$ xxx
    //O preço do par de sapatos com desconto é R$ xxx
    //Entradas: valorProduto
    //processo: desconto = preco - 12%
    //saidas: desconto, valorProduto

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        float desconto;

        System.out.println("escreva o valor do sapato");
        float valorProduto = scr.nextInt();

        desconto = (float) (valorProduto - (valorProduto * 0.12));

        System.out.println("O valor inicial do sapato é " + valorProduto + " Mas agora com o desconto é " + desconto);

        scr.close();
    }
}
