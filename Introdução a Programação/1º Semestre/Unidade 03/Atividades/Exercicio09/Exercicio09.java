import java.util.Scanner;

public class Exercicio09 {

    //Descreva um programa que calcule o volume de uma lata de óleo. 
    //Entredas: Raio, altura 
    //Processo: volume = 3,14159 * (raio * raio) * altura
    //Saida:volume
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o raio do barril: ");
        double raio = leitor.nextDouble();
        System.out.println("Informe a altura do barril: ");
        double altura = leitor.nextDouble();

        double volume;
    
        volume = 3.14159 * (raio * raio) * altura;

        System.out.println("O numero do volume é: " + volume);
        
        leitor.close();
    }
}
