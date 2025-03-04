import java.util.Scanner;

public class Exercicio10 {

    //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
    //Analise: Tudo certo.
    //Entredas: NS
    //Saida: H, M, S
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
