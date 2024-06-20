package quest19;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numerosUsuario = new HashSet<>();
        Random random = new Random();

        System.out.println("Escolha seis números entre 1 e 60:");
        while (numerosUsuario.size() < 6) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido. Por favor, escolha um número entre 1 e 60.");
            } else if (numerosUsuario.contains(numero)) {
                System.out.println("Você já escolheu esse número. Escolha outro número.");
            } else {
                numerosUsuario.add(numero);
            }
        }

        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            int numeroSorteado = random.nextInt(60) + 1;
            numerosSorteados.add(numeroSorteado);
        }

        System.out.println("Números sorteados: " + numerosSorteados);

        int acertos = 0;
        for (int numero : numerosUsuario) {
            if (numerosSorteados.contains(numero)) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " número(s).");

        scanner.close();
    }
}
