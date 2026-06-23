import java.util.Scanner;

public class Jogador {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Bem vindo ao programa de inscrição de atletas!!");
        System.out.print(" Por favor digiteo nome do atleta: \n");
        String nomeDigitado = leitor.nextLine();
        System.out.printf("O nome do atleta é: %s", nomeDigitado);
        System.out.print("\nAgora digite a altura dele: \n");
        double alturaDigitada = leitor.nextDouble();
        System.out.printf(" %s possui %.2fcm de altura ", nomeDigitado, alturaDigitada);
        System.out.print("Agora digite o peso do atleta: ");
        double pesoDigitado = leitor.nextDouble();
        System.out.printf("%s pesa %.0fkg", nomeDigitado, pesoDigitado);
        leitor.nextLine();
        System.out.print("Agora digite o esporte que o atleta pratica: ");
        String esporteDigitado = leitor.nextLine();
        //leitor.nextLine();
        Atleta atleta1 = new Atleta(nomeDigitado, alturaDigitada, pesoDigitado, esporteDigitado);
        System.out.print(atleta1);
        System.out.printf(" %s >>  Altura: %.2fcm, peso %.0fkg, profissão: %s", nomeDigitado, alturaDigitada,
                pesoDigitado, esporteDigitado);
    }
}
