package quest12;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 100).");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior do que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor do que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
