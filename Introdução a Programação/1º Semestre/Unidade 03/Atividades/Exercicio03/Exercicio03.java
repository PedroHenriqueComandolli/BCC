import java.util.Scanner;

public class Exercicio03 {

    //Um motorista deseja abastecer seu tanque de combustível. 
    //Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
    //Entradas: valorGasolina, valorGasto
    //processo: qntLitors = valorGasto / valorGasolina
    //saidas: qntLitors

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        float qntLitors, valorGasolina, valorGasto;

        System.out.println("escreva o valor da gasolina");
        valorGasolina = scr.nextFloat();
        System.out.println("escreva o valor gasto para encher o tanque");
        valorGasto = scr.nextFloat();

        qntLitors = (valorGasto / valorGasolina);

        System.out.println("O quantidade de litros utilizados para encher o tanque é de " + qntLitors);

        scr.close();
    }
}
