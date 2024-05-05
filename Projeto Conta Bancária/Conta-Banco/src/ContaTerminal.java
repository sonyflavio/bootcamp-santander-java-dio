import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao banco Devcash");
        System.out.println();
        System.out.println("Qual seu nome? ");
        String clientName = sc.nextLine();

        System.out.println("Por favor, digite o número  da sua Conta! ");
        int accountNumber = sc.nextInt();

        System.out.println("Agora digite sua Agêcia! ");
        String agency = sc.next();

        System.out.println("Digite o valor de depósito inicial: ");
        double initialBalance = sc.nextDouble();
        
        System.out.println("Olá " + clientName + " " + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + " " + ", conta " + accountNumber + " " + "e seu saldo " + "R$"+initialBalance + " " + "já está disponível para saque." );
        System.out.println();
        
        System.out.println("O banco Devcash agradeçe a preferência!");
        System.out.println("Tenha um ótimo dia.");




        sc.close();
    }
}
