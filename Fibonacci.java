package quest11;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantos termos da sequência de Fibonacci deseja? ");
        int n = scanner.nextInt();


        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}