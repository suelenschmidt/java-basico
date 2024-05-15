import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       // Solicita ao usuário que digite o número da agência
       System.out.println("Por favor, digite o número da Agência:");
       String agencia = scanner.nextLine();

       // Solicita ao usuário que digite o número da conta
       System.out.println("Por favor, digite o número da Conta:");
       int numero = scanner.nextInt();
       scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro

       // Solicita ao usuário que digite o nome do cliente
       System.out.println("Por favor, digite o nome do Cliente:");
       String nomeCliente = scanner.nextLine();

       // Solicita ao usuário que digite o saldo inicial
       System.out.println("Por favor, digite o saldo inicial:");
       double saldo = scanner.nextDouble();

       // Exibe a mensagem com os dados inseridos pelo usuário
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
       System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + " disponível para saque.");

       scanner.close();
    }
}
