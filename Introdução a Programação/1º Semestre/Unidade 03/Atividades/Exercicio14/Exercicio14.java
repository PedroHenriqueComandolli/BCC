import java.util.Scanner;

public class Exercicio14 {

    //Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
    //Entredas: distancia, tempo
    //Processo: velocidade = distancia * tempo, litro = distancia / 12
    //Saida: litro, velocidade
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double distancia;
        double tempo;
        double velocidade;
        double litro;

        System.out.println("Informe o tempo: ");
        tempo = leitor.nextDouble();
        System.out.println("Informe a distancia: ");
        distancia = leitor.nextDouble();

        velocidade = distancia / tempo;
        litro = distancia / 12;

        System.out.println("A quantidade de litros é de "+ litro);
        System.out.println("A velocidade média é de "+ velocidade+" km/h");
        
        leitor.close();
    }
}
