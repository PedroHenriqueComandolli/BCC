import java.util.Scanner;

public class Exercicio16 {

    //Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.  
    //Entredas: valorCompra, centena, dezena, unidade, valorNotas, qntNotas
    //Processo: centena = valor / 100
    //Processo: dezena = (valor % 100) / 10
    //Processo: unidade = valor % 10
    //Saida: valor, dezena, unidade
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valorCompra, centena, dezena, unidade, valorNotas, qntNotas, valorTroco;

        System.out.println("Informe o valor da compra: ");
        valorCompra = leitor.nextInt();
        System.out.println("informe o valor dado em dinheiro: ");
        valorNotas = leitor.nextInt();

        valorTroco = valorNotas - valorCompra;

        centena = valorTroco / 100; 
        dezena = (valorTroco % 100) / 10;
        unidade = valorTroco % 10;

        qntNotas = centena + dezena + unidade;

        System.out.println("A numero de notas é " + qntNotas);
        
        leitor.close();
    }
}
