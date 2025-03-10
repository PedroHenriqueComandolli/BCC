import java.util.Scanner;

public class Exercicio10 {

    //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
    //Entredas: catetoOposto, catetoAdjacente
    //Processo: hipotenusa = raiz((catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente))
    //Saida:hipotenusa
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o cateto oposto: ");
        double catetoOposto = leitor.nextDouble();
        System.out.println("Informe a cateto adjacente: ");
        double catetoAdjacente = leitor.nextDouble();

        double hipotenusa;
    
        hipotenusa = Math.sqrt ((catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente));

        System.out.println("O numero da hipotenusa é: " + hipotenusa);
        
        leitor.close();
    }
}
