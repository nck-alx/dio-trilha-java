import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean inputInvalido = true;

        while (inputInvalido){
            System.out.println("Digite qual dia da semana é hoje:");
            int num = leitor.nextInt();
            switch (num){
                case 1:
                    System.out.println("Hoje é Domingo\nFIM DE SEMANA!");
                    inputInvalido = false;
                    break;
                case 2:
                    System.out.println("Hoje é Segunda-feira");
                    inputInvalido = false;
                    break;
                case 3:
                    System.out.println("Hoje é Terça-feira");
                    inputInvalido = false;
                    break;
                case 4:
                    System.out.println("Hoje é Quarta-feira");
                    inputInvalido = false;
                    break;
                case 5:
                    System.out.println("Hoje é Quinta-feira");
                    inputInvalido = false;
                    break;
                case 6:
                    System.out.println("Hoje é Sexta-feira");
                    inputInvalido = false;
                    break;
                case 7:
                    System.out.println("Hoje é Sábado\nFIMDESEMANA!");
                    inputInvalido = false;
                    break;
                default:
                    System.out.println("Digite um número válido");

            }
        }
        leitor.close();
        }
    }