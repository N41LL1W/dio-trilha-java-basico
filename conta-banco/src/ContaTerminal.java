import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            // Exibe uma mensagem pedindo ao usuário para digitar algo
            System.out.println("Por favor, digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Por favor, digite o nº da agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nº da conta: ");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o valor do depósito: ");
            double saldo = scanner.nextDouble();

            // Formata o saldo para aparecer com R$ e duas casas decimais
            DecimalFormat df = new DecimalFormat("R$ #,##0.00");

            System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + df.format(saldo) + " já está disponível para saque.");
        }
    }
}
