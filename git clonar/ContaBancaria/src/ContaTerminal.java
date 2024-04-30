import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String cliente = scanner.nextLine();
        System.out.println("Entre com a sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();
               
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + " e o número da sua conta é  " + numeroConta);
        System.out.println("O saldo da sua conta bancaria é " + saldo);
    }
}
