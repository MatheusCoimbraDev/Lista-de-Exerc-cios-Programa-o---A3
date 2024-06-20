package quest2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja calcular? ");
        int quantNotas = scanner.nextInt();

        double[] notas = new double[quantNotas];
        double soma = 0;

        for (int i = 0; i < quantNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / quantNotas;

        System.out.printf("A média é: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}
