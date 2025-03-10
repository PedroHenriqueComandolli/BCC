import java.util.Scanner;

public class Exercicio11 {

    //Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula
    //Entredas: celsius
    //Processo: fahrenheit = celsius + 33.8
    //Saida: fahrenheit
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double celsius;

        System.out.println("Informe o grau em celsius: ");
        celsius = leitor.nextDouble();

        double fahrenheit;
    
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("O numero do grau em fahrenheit é: " + fahrenheit);
        
        leitor.close();
    }
}
