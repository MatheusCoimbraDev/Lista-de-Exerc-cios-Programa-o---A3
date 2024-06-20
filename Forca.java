package quest7;

import java.util.Random;
import java.util.Scanner;

public class Forca {
    private static final String[] PALAVRAS = {"FESTA", "JULHO", "CANJICA", "ARRAIA", "CALDO"};
    private static final int MAX_TENTATIVAS = 6;
    public static void main(String[] args) {

        Random random = new Random();
        String palavra = PALAVRAS[random.nextInt(PALAVRAS.length)];

        char[] progresso = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            progresso[i] = '_';
        }
        int tentativas = 0;
        boolean palavraCompleta = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (tentativas < MAX_TENTATIVAS && !palavraCompleta) {
            System.out.println("Palavra: " + new String(progresso));
            System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean acerto = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    progresso[i] = letra;
                    acerto = true;
                }
            }
            if (!acerto) {
                tentativas++;
            }

            palavraCompleta = true;
            for (int i = 0; i < progresso.length; i++) {
                if (progresso[i] == '_') {
                    palavraCompleta = false;
                    break;
                }
            }
        }
        if (palavraCompleta) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavra);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }
        scanner.close();
    }
}
