import java.util.Scanner;
 
public class Exercicio07 {

    //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
    //Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
    //Entradas: qnt350ml, qnt600ml, qnt2litros
    //processo: totalLitros = (qnt350ml * 0,35) + (qnt600ml * 0,6) + (qnt2litros * 2)
    //saidas: totalLitros

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        double qnt350ml;
        double qnt600ml;
        double qnt2litros;
        double totalLitros;

        System.out.println("Informe o numero total de garrafas de 350ml");
        qnt350ml = src.nextDouble();
        System.out.println("Informe o numero total de garrafas de 600ml");
        qnt600ml = src.nextDouble();
        System.out.println("Informe o numero total de garrafas de 2 litros");
        qnt2litros = src.nextDouble();

        totalLitros = (qnt350ml * 0.35) + (qnt600ml * 0.6) + (qnt2litros * 2);

        System.out.println("O valor de litros é de " + totalLitros);

        src.close();       
    }
}
 