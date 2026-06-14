import java.util.Scanner;

public class TreinoDeSwitchCase {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int status = 0;
        System.out.println("Digite um número de 1 a 3 para verificar o status do pedido: \n");
        status = leitor.nextInt();
        switch (status) {
            case 1:
                System.out.println("Pedido recebido");
            break;
            case 2:
                System.out.println("Pagamento aprovado");
            break;
            case 3:
                System.out.println("Pedido enviado");
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }

        int hero = 0;

        System.out.println("Escolha um herói para sua aventura: \n");
        System.out.println("1- Warrior  |  2- mage  |  3- archer \n");
        hero = leitor.nextInt();
        switch (hero) {
            case 1 -> System.out.println("\nVocê escolheu o Warrior");
            case 2 -> System.out.println("\nVocê escolheu o mage");
            case 3 -> System.out.println("\nVocê escolheu o archer");
            default -> System.out.println("\nOpção inválida! Escolha um herói disponível.");
        }
    }
}




