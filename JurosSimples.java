package quest16;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial (em reais): ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em porcentagem, por exemplo, 5 para 5%): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o período de tempo (em anos): ");
        int tempo = scanner.nextInt();

        double montanteFinal = calcularJurosSimples(capitalInicial, taxaJuros, tempo);

        System.out.printf("O montante final após %d anos é: R$ %.2f\n", tempo, montanteFinal);
    }

    public static double calcularJurosSimples(double capitalInicial, double taxaJuros, int tempo) {
        taxaJuros = taxaJuros / 100;

        double montanteFinal = capitalInicial + (capitalInicial * taxaJuros * tempo);

        return montanteFinal;
    }
}
