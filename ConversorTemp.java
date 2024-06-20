package quest10;

import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
                break;

            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

        scanner.close();
    }
}
