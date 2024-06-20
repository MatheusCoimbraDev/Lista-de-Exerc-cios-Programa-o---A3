package quest4;

public class Regressiva {
    public static void main(String[] args) {
        System.out.println("Contagem regressiva para o Ano Novo!");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Ocorreu um erro durante a pausa: " + e.getMessage());
            }
        }

        System.out.println("Feliz Ano Novo!");
    }
}
