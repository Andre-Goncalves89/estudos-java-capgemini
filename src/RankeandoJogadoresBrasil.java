import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RankeandoJogadoresBrasil {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(List.of("Pelé", "Ronaldo", "Ronaldinho", "Rivaldo", "Romário", "Kaká",
                "Neymar", "Cafu", "Roberto Carlos", "Zico"));
        Random random = new Random();
        String [] podio = new String[10];
        boolean precisaSortear = true;
        int indiceSorteado = 0;
       // int posicaoJogador = 0;
        String jogadorSorteado= "";
        while (list.size() > 0) {
            if(precisaSortear) {
                indiceSorteado = random.nextInt(list.size());
                jogadorSorteado = list.get(indiceSorteado);
            }
            System.out.println(jogadorSorteado);
            System.out.println("Escolha em qual posição o " + jogadorSorteado + " ficará, de 1 a 10 no pódio: \n");
            int posicaoJogador = leitor.nextInt();
            if(podio[posicaoJogador - 1] != null) {
                System.out.println("Essa posição já foi ocupada! Escolha outra posição para " + jogadorSorteado + ".");
                precisaSortear = false;
                continue;
            }
            podio[posicaoJogador - 1] = jogadorSorteado;
            list.remove(indiceSorteado);
            precisaSortear = true;
        }
        System.out.println("\nSeu pódio ficou assim: ");
        for(int i = 0; i < podio.length; i++) {
            System.out.println((i + 1) + "° lugar: " + podio[i]);
        }
    }
}
