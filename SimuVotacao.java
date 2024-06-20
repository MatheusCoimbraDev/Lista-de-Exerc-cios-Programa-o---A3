package quest8;

import java.util.Scanner;


public class SimuVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de candidatos: ");
        int numeroCandidatos = scanner.nextInt();
        scanner.nextLine();

        String[] candidatos = new String[numeroCandidatos];
        int[] votos = new int[numeroCandidatos];

        for (int i = 0; i < numeroCandidatos; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
            votos[i] = 0;
        }

        System.out.print("Digite o número de votantes: ");
        int numeroVotantes = scanner.nextInt();

        for (int i = 0; i < numeroVotantes; i++) {
            System.out.println("Votante " + (i + 1) + ":");
            System.out.println("Escolha o número do candidato:");
            for (int j = 0; j < numeroCandidatos; j++) {
                System.out.println((j + 1) + " - " + candidatos[j]);
            }
            int voto = scanner.nextInt();

            if (voto >= 1 && voto <= numeroCandidatos) {
                votos[voto - 1]++;
            } else {
                System.out.println("Número de candidato inválido. Tente novamente.");
                i--;
            }
        }

        System.out.println("Resultado da votação:");
        for (int i = 0; i < numeroCandidatos; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        scanner.close();
    }
}

