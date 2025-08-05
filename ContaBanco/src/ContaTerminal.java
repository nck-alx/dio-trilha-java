import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO WOODSTONE. \nPressione ENTER para criar sua conta");
        scanner.nextLine();
        System.out.print("Digite o código de sua agência: ");
        var agencia = scanner.next();
        
        System.out.print("Digite o número de sua conta: ");
        var numero = scanner.nextInt();
        
        System.out.print("Digite seu primeiro e segundo nome: ");
        scanner.nextLine();
        var nome = scanner.nextLine();

        System.out.print("Insira o valor do seu saldo: ");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá, %s! Obrigado por criar uma conta no Banco Woodstone.%n", nome);
        System.out.printf("Agência: %s%nConta: %d%nSaldo: R$ %.2f%n", agencia, numero, saldo);
        scanner.close();

    }
}