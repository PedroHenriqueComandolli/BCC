import java.util.Scanner;
 
public class Exercicio06 {

    //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
    //Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
    //Entradas: peso
    //processo: totalPago = peso * 25
    //saidas: totalPago

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        double peso;
        float totalPago;

        System.out.println("Informe o peso do prato em kilos?");
        peso = src.nextDouble();
 
        totalPago = (float) ((peso - 0.75) * 25);

        System.out.println("O valor a ser pago é de R$ " + totalPago);

        src.close();       
    }
}
 