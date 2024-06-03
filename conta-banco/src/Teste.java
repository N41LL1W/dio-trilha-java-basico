
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Exibe uma mensagem pedindo ao usuário para digitar algo
            System.out.println("Digite seu nome: ");

            // Lê a entrada do usuário
            String nome = scanner.nextLine();

            // Exibe a entrada do usuário
            System.out.println("Olá, " + nome + "!");
        }
    }
}
