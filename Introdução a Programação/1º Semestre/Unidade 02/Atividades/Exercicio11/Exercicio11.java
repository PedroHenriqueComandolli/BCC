import java.util.Scanner;

public class Exercicio11 {
    
    //Analise do problema: Todos Valores são utilizados
    //Entradas: valorA, valorB, valorC
    //Saida: areaTriangulo, areaCirculo,areaTrapezio, areaQuadrado, areaRetangulo
    //Processo:areaTriangulo = (valorA*valorB)/2;areaCirculo = (float) ((valorC*valorC)*3.14159);areaQuadrado = (valorB*valorB);areaRetangulo = (valorA*valorB);
    //Teste:
    //valorA        | 3   | 4    | 4     |
    //valorB        | 3   | 4    | 5     |
    //valorC        | 3   | 4    | 4     |
    //areaTriangulo | 4.5 | 8    | 10    |
    //areaCirculo   |28.27| 50.26| 50.26 |
    //areaTrapezio  | 9   | 16   | 18    |
    //areaQuadrado  | 9   | 16   | 25    |
    //areaRetangulo | 9   | 16   | 20    |

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor A:");
        float valorA = leitor.nextFloat();
        System.out.println("Valor B: ");
        float valorB = leitor.nextFloat();
        System.out.println("Valor C: ");
        float valorC = leitor.nextFloat();

        float areaTriangulo = (valorA*valorB)/2;
        float areaCirculo = (float) ((valorC*valorC)*3.14159);
        float areaTrapezio = ((valorA+valorB)*valorC)/2;
        float areaQuadrado = (valorB*valorB);
        float areaRetangulo = (valorA*valorB);

        System.out.println("a área do triângulo retângulo que tem A por base e C por altura: "+areaTriangulo);
        System.out.println("a área do círculo de raio C. (pi = 3.14159: "+areaCirculo);
        System.out.println("a área do trapézio que tem A e B por bases e C por altura: "+areaTrapezio);
        System.out.println("a área do quadrado que tem lado B: "+areaQuadrado);
        System.out.println(" a área do retângulo que tem lados A e B: "+areaRetangulo);
        leitor.close();
    }
}