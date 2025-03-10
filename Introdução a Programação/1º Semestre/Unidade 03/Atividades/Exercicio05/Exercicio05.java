import java.util.Scanner;
 
public class Exercicio05 {

    //Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação
    // no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
    // Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
    // faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
    //Entradas: qtdGalinhas, totalValor
    //processo: totalValor = qtdGalinhas * 11
    //saidas: totalValor

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int qtdGalinhas, totalValor;
        System.out.println("Quantas galinhas você deseja marcar?");
        qtdGalinhas = src.nextInt();
 
        totalValor = qtdGalinhas * 11;
        System.out.println("O gasto total para marcar "+qtdGalinhas+" é de: "+totalValor);

        src.close();       
    }
}
 