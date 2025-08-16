import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO WOODSTONE. \nPressione ENTER para criar sua conta");
        scanner.nextLine();
        System.out.print("Digite o código de sua agência: ");
        int agencia = scanner.nextInt(); //scanner identifica o número digitado e armazena na variável agencia
        while (agencia>999 || agencia<=0 || agencia < 99) {
            System.out.println("Informe uma agência válida!: ");
            agencia = scanner.nextInt();
        }
        
        System.out.print("Digite o número de sua conta: ");
        int numero = scanner.nextInt(); //scanner identifica o número digitado e armazena na variável numero
        while (numero>999 || numero<=0 || numero < 99) {
            System.out.println("Informe um numero de conta válido!: ");
            numero = scanner.nextInt();
        
        System.out.print("Digite seu primeiro e segundo nome: ");
        scanner.nextLine(); //consome o "enter" que sobrou
        String nome = scanner.nextLine(); //scanner identifica o que foi digitado e armazena na variável nome
        while (!nome.matches("[a-zA-Z\\s]+")){
            System.out.println("Informe um nome válido!");
            nome = scanner.nextLine();
        }

        System.out.print("Insira o valor do seu saldo: ");
        var saldo = scanner.nextDouble(); //scanner identifica o numero digitado e armazena na variável saldo

        System.out.printf("Olá, %s! Obrigado por criar uma conta no Banco Woodstone.%n", nome);
        System.out.printf("Agência: %s%nConta: %d%nSaldo: R$ %.2f%n", agencia, numero, saldo);
        scanner.close(); //fecha o scanner

    }
}}