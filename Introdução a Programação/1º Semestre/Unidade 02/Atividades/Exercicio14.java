import java.util.Scanner;

public class Exercicio14 {

    //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
    //As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
    //Analise: Tudo certo.
    //Entredas: 
    //Saida: 
    //Processo:  sobraHoras = NS / 3600, sobraMinutos = (sobraHoras / 60), sobraSegundos = sobraMinutos
    //Teste:
    //SegundosTotais           | 3662  | 7216  |
    //Horas                    | 0001  | 0002  |
    //Minutos                  | 0001  | 0000  |
    //Segundos                 | 0002  | 0016  |
    //tempo                    | 1H1m2 | 2H16S |

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tempo em segundos: ");
        int NS = leitor.nextInt();

        int qntHoras = 0;
        int qntMinutos = 0;
        int qntSegundos = 0;
    
        qntHoras = NS / 3600;  
        NS = NS % 3600;        
        qntMinutos = NS / 60;  
        qntSegundos = NS % 60;

        System.out.println("O numero de horas é: " + qntHoras);
        System.out.println("O numero de minutos é: " + qntMinutos);
        System.out.println("O numero de segundos é: " + qntSegundos);

        leitor.close();
    }
}
