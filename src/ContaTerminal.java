import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da conta:");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome:");
        String nome = scanner.next();

        System.out.println("Informe o seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Informe o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome +" "+ sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
