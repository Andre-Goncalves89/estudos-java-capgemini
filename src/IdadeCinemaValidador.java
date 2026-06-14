import java.util.Scanner;

public class IdadeCinemaValidador {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();


        System.out.println("Bem vindo, " + nome + "!!");

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos de idade. Acesso a filmes de ação liberado!");
        } else {
            System.out.println("Você tem " + idade + " anos de idade. Menor de idade, acesso negado à sessão de filmes de ação.");
        }

        leitor.close();
    }
}
