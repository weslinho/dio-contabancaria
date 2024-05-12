import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da sua conta:");
        int accountNumber = scanner.nextInt();

        System.out.println("Informe o número da agência:");
        String branchNumber = scanner.next();

        System.out.println("Informe o seu nome completo:");
        String clientName = scanner.next();

        System.out.println("Informe o saldo:");
        double clientBalance = scanner.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + branchNumber + ", conta " + accountNumber + " e seu saldo " + clientBalance + " já está disponível para saque");
    }
}
