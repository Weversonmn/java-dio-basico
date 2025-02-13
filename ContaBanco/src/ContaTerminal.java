import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldoConta;

        System.out.print("Informe o numero da Conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Informe o numero da Agência: ");
        numeroAgencia = scanner.nextLine();

        System.out.println("Informe o Nome e Sobrenome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o Saldo Inicial da Conta: ");
        saldoConta = scanner.nextDouble();

        System.out.println();

        System.out.println("Olá "+ nomeCliente +", Obrigado por criar uma conta em nosso banco,sua Agência é "
        + numeroAgencia + ", Conta: " + numeroConta +
        ", e seu saldo é de R$ "  + saldoConta + " e ja está disponivel para saque");


        scanner.close();
    
    }
}
