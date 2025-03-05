import java.util.Scanner;

public class Exercicio13 {
    
    //Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade 
    //constante de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, 
    //consegue se afastar um quilômetro a cada 2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos)
    //para o carro Y tomar essa distância do outro carro.

    // Analise: A velocidade os "nomes" dos carros estão redundantes
    // Entradas: distancia
    // Saida: tempo
    // Processo: distancia * 2
    // Teste:
    // distancia  | 1 | 10 | 20 |
    // tempo      | 2 | 20 | 40 |
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Qual a distancia que percorrerá/percorrida?");
        int distancia = src.nextInt();
        int tempo = distancia * 2;

        System.out.println("O tempo que levará/levou será/foi de: " + tempo + " minutos");

    }
}