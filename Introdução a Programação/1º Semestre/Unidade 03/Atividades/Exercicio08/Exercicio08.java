import java.util.Scanner;
 
public class Exercicio08 {

    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    //Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
    //Entradas: dolar
    //processo: real = dolar * 5.65
    //saidas: real

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        double dolar;
        double real;

        System.out.println("Informe o numero total de dolares");
        dolar = src.nextDouble();

        real = dolar * 5.65;

        System.out.println("O valor de reais é de " + real);

        src.close();       
    }
}
 