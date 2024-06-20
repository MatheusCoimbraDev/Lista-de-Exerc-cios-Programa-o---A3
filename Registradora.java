package quest3;

import java.util.Scanner;

public class Registradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double precoItem;

        System.out.println("Caixa Registradora do Supermercado");
        System.out.println("Digite o preço de cada item. Digite 0 para finalizar a compra.");

        while (true) {
            System.out.print("Digite o preço do item: R$ ");
            precoItem = scanner.nextDouble();
            if (precoItem == 0) {
                break;
            }
            total += precoItem;
        }
        if (total > 100) {
            double desconto = total * 0.10;
            total -= desconto;
            System.out.printf("Desconto de 10%% aplicado: R$ %.2f\n", desconto);
        }
        System.out.printf("Total da compra: R$ %.2f\n", total);

        scanner.close();
    }
}
