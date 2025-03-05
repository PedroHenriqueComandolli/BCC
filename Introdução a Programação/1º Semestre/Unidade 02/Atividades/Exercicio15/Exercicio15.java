import java.util.Scanner;

public class Exercicio15 {

    // Análise do problema: O código recebe um valor que o usuário possui (valorPossuido) e decompõe esse valor em notas e moedas.
    // Entradas: valorPossuido.
    // Saídas: As quantidades de notas e moedas que representam esse valor. 
    // Processo: Através de um loop, o valor é subtraído sucessivamente pelas maiores denominações de notas e moedas possíveis.
    // Teste:
    // Entrada: valorPossuido = 9.99
    // Saída :
    // Notas: 5: 1, 2: 2
    // Moedas: 1: 0, 0.50: 1, 0.25: 1, 0.10: 2, 0.05: 1, 0.01: 4
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double notas[] = {0.0,0.0,0.0,0.0,0.0,0.0};
        double moedas[] = {0.0,0.0,0.0,0.0,0.0,0.0};
        double valorPossuido = 0.0;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Valor Possuído: ");
                valorPossuido = leitor.nextDouble();
                if (valorPossuido >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Iinsira um valor positivo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                leitor.next(); 
            }
        }

        while (valorPossuido >= 1.00) {
            if (valorPossuido >= 100) {
                notas[0]++;
                valorPossuido -= 100;
            } else if (valorPossuido >= 50) {
                notas[1]++;
                valorPossuido -= 50;
            } else if (valorPossuido >= 20) {
                notas[2]++;
                valorPossuido -= 20;
            } else if (valorPossuido >= 10) {
                notas[3]++;
                valorPossuido -= 10;
            } else if (valorPossuido >= 5) {
                notas[4]++;
                valorPossuido -= 5;
            } else if (valorPossuido >= 2) {
                notas[5]++;
                valorPossuido -= 2;
            }
        }

        while (valorPossuido > 0 && valorPossuido <= 1) {
            if (valorPossuido >= 1) {
                moedas[0]++;
                valorPossuido -= 1;
            } else if (valorPossuido >= 0.50) {
                moedas[1]++;
                valorPossuido -= 0.50;
            } else if (valorPossuido >= 0.25) {
                moedas[2]++;
                valorPossuido -= 0.25;
            } else if (valorPossuido >= 0.10) {
                moedas[3]++;
                valorPossuido -= 0.10;
            } else if (valorPossuido >= 0.05) {
                moedas[4]++;
                valorPossuido -= 0.05;
            } else if (valorPossuido >= 0.01) {
                moedas[5]++;
                valorPossuido -= 0.01;
            }
            valorPossuido = Math.round(valorPossuido * 100.0) / 100.0; 
        }

        System.out.println("Notas:\n100: "+notas[0]+"\n50: "+notas[1]+"\n20: "+notas[2]+"\n10: "+notas[3]+"\n5: "+notas[4]+"\n2: "+notas[5]);
        System.out.println("Moedas:\n1: "+moedas[0]+"\n0.50: "+moedas[1]+"\n0.25: "+moedas[2]+"\n0.10: "+moedas[3]+"\n0.05: "+moedas[4]+"\n0.01: "+moedas[5]);
        leitor.close();
    }
}