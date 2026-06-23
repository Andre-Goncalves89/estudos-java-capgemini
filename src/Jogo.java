import java.util.Scanner;

public class Jogo {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDigitado;
        System.out.println("Vamos iniciar sua aventura!");
        System.out.println("Dê um nome para o seu mago: ");
        nomeDigitado = leitor.nextLine();
        Mage mago1 = new Mage(nomeDigitado, 100, 1, 300);
        System.out.println(mago1.atacarBasico());
        System.out.println(mago1.atacarBasico());
        System.out.println(mago1.atacarBasico());
        System.out.println(mago1.atacarBasico());

        Char personagem = new Mage("Rufus", 100, 1, 300);
        System.out.println(personagem.atacarBasico());

        leitor.close();
    }
}
