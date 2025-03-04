import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        //Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
        //Analise do problema: Nome não está sendo utilizado
        //Entradas: nomeVendedor, salarioFixo, totalVendas
        //Saida: valorFinal
        //Processo: valorFinal = salarioFixo + (totalVendas*0.15)
        //Teste:
        //salarioFixo   | 30  | 40 | 50  |
        //valorVendas   |100  |100 |100|
        //valorFinal    |45   |55  |65|


        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome Vendedor: ");
        String nomeVendedor = leitor.next();
        System.out.println("Salario Fixo: ");
        double salarioFixo = leitor.nextDouble();
        System.out.println("Valor Total das vendas: ");
        double totalVendas = leitor.nextDouble();

        double valorFinal = salarioFixo+(totalVendas*0.15);
        System.out.println("Valor Final: "+valorFinal);
        
        leitor.close();
    }
}