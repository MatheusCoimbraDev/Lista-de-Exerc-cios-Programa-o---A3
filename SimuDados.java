package quest13;

import java.util.Random;
import java.util.Scanner;

public class SimuDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de vezes que deseja lançar os dados: ");
        int numeroLancamentos = scanner.nextInt();

        int[] frequencia = new int[13];

        for (int i = 0; i < numeroLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int resultado = dado1 + dado2;
            frequencia[resultado]++;
        }

        System.out.println("Frequência dos resultados:");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + ": " + frequencia[i] + " vezes");
        }

        scanner.close();
    }
}
