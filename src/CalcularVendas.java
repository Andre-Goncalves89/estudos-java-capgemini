import java.util.Scanner;

public class CalcularVendas {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDoProduto;
        double valorBaseDoProduto;
        double desconto;
        double frete;

        System.out.print("Digite o nome do produto: ");
        nomeDoProduto = leitor.nextLine();
        System.out.print("\n digite od valor do produto: ");
        valorBaseDoProduto = leitor.nextDouble();

        if(valorBaseDoProduto >= 500) {
            frete = 0;
            desconto = valorBaseDoProduto * 0.10;
        } else {
            frete = 50;
            desconto = valorBaseDoProduto * 0.05;
        }
        double valorFinalDoProduto = (valorBaseDoProduto - desconto) + frete;
        System.out.println("--- RESUMO DA VENDA ---");
        System.out.printf("PRODUTO: %s", nomeDoProduto);
        System.out.printf("\n VALOR ORIGINAL: %.2f", valorBaseDoProduto);
        System.out.printf("\n DESCONTO APLICADO: %.2f", desconto);
        System.out.printf("\n VALOR DO FRETE: %.2f", frete);
        System.out.println("\n -----------------------");
        System.out.printf("VALOR TOTAL A PAGAR: %.2f", valorFinalDoProduto);




    }
}
