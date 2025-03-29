import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.printf("Digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.printf("Digite o número da agencia: ");
        agencia = sc.nextLine();

        
        System.out.printf("Digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.printf("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
        nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}