import java.util.Scanner;

public class Exercicio12 {

    //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
    //Entredas: nome, horasTrabalhadas, dependentes
    //Processo: salarioLiquido = ((salarioBruto = horasTrabalhadas * 10) * 0.915)
    //Saida: salarioBruto, salarioLiquido
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        double horasTrabalhadas, dependentes, salarioBruto, salarioLiquido, salarioFamilia, salarioInicial, salarioHoraTrabalhada;

        System.out.println("Informe o nome: ");
        nome = leitor.next();
        System.out.println("Informe horas trabalhadas: ");
        horasTrabalhadas = leitor.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        dependentes = leitor.nextDouble();

        salarioFamilia = dependentes * 60;
        salarioHoraTrabalhada = horasTrabalhadas * 10;
        salarioInicial = salarioFamilia + salarioHoraTrabalhada;
        salarioBruto = (salarioHoraTrabalhada * 0.865);
        salarioLiquido = salarioFamilia + salarioBruto;

        System.out.println("O funcionário "+ nome + " possui um salário bruto de " + salarioInicial + " e um salário líquido de " + salarioLiquido);
        
        leitor.close();
    }
}
