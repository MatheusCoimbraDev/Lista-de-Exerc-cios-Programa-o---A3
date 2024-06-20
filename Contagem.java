package quest1;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos produtos diferentes você deseja registrar?");
        int nProd = scanner.nextInt();
        scanner.nextLine();

        String[] nameProd = new String[nProd];
        int[] qProd = new int[nProd];

        for (int i = 0; i < nProd; i++) {
            System.out.println("Digite o nome do produto que deseja registrar: ");
            nameProd[i] = scanner.nextLine();
            System.out.println("Digite a quantidade do produto: " + nameProd[i]);
            qProd[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("\nLista de produtos e quantidades");
        for (int i = 0; i < nProd; i++){
            System.out.println("Produto: " + nameProd[i] + "Quantidade: " + qProd[i]);
        }
        scanner.close();
    }
}
