import java.util.Scanner;
import java.util.Arrays;

public class CdastroItensRPG {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Vamos cadastrar 3 itens do seu inventário de RPG.");
        int i = 0;
        String item1 = "";
        String item2 = "";
        String item3 = "";
        String [] inventario = {item1, item2, item3};

        while(i < inventario.length){
            System.out.println("Digite o nome do item que ficará no seu inventário");
            inventario[i] = leitor.nextLine();
            System.out.println("Item cadastrado com sucesso!");
            i++;
        }
        leitor.close();
        System.out.println(Arrays.toString(inventario));
    }
}
