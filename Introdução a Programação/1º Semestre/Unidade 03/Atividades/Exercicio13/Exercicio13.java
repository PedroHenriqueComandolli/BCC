import java.util.Scanner;

public class Exercicio13 {

    //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
    //Entredas: altura, comprimento
    //Processo: metro = (altura * comprimento) * (9 * 12.50)
    //Saida: valor
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        
        double altura, comprimento, metro, valor;

        System.out.println("Informe o comprimento: ");
        comprimento = leitor.nextDouble();
        System.out.println("Informe a altura: ");
        altura = leitor.nextDouble();

        metro = (altura * comprimento);
        valor = metro * (9 * 12.50);

        System.out.println("O valor é de "+ valor);
        
        leitor.close();
    }
}
