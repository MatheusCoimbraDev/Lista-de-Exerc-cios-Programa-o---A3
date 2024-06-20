package quest17;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo (em reais): ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em porcentagem, por exemplo, 2 para 2%): ");
        double taxaJurosMensal = scanner.nextDouble();

        System.out.print("Digite o número de meses para pagar: ");
        int numeroMeses = scanner.nextInt();

        double prestacaoMensal = calcularPrestacaoMensal(valorEmprestimo, taxaJurosMensal, numeroMeses);

        System.out.printf("O valor da prestação mensal é: R$ %.2f\n", prestacaoMensal);
    }

    public static double calcularPrestacaoMensal(double valorEmprestimo, double taxaJurosMensal, int numeroMeses) {
        double taxaJurosDecimal = taxaJurosMensal / 100;

        double prestacaoMensal = (valorEmprestimo * taxaJurosDecimal) / (1 - Math.pow(1 + taxaJurosDecimal, -numeroMeses));

        return prestacaoMensal;
    }
}
