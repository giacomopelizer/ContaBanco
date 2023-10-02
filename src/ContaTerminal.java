import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 237.48;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da sua Agência");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

         System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + conta + " e seu saldo de R$ " + saldo + " já encontra-se disponível para saque.");
    }
}
