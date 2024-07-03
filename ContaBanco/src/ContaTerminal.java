import java.util.Scanner;

/**
 * @author Édimo Miranda Coelho
 * @since 07/2024
 * 
 */

public class ContaTerminal {
    private int numeroConta;
    private String codigoAgencia;
    private String nomeCliente;
    private double saldo;
    
    public ContaTerminal(int numeroConta, String codigoAgencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.codigoAgencia = codigoAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Código da Agência: " + codigoAgencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Por favor, digite o código da agência: ");
            String codigoAgencia = scanner.next();

            System.out.print("Por favor, digite o seu nome: ");
            String nomeCliente = scanner.next();

            System.out.print("Por favor, digite um saldo desejado: ");
            double saldoInicial = scanner.nextDouble();

            ContaTerminal conta = new ContaTerminal(numeroConta, codigoAgencia, nomeCliente, saldoInicial);

            conta.exibirInformacoes();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + codigoAgencia + ", conta " + numeroConta + " e o seu saldo R$" + saldoInicial + " já está disponível para saque.");
        }
    }
}
