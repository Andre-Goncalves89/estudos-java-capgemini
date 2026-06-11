public class Class {
    static void main(String[] args) {

        String nomeProduto = "Mouse Game RGB";
        int quantidadeAtual = 3;
        int limiteMinimo = 5;
        double precoUnitario = 129.9;

        System.out.println("----- ANALISADOR DE ESTQQUE TECHNOVA -----");
        System.out.println("produto:" + nomeProduto);
        System.out.println("QQuantidade em estoque: " + quantidadeAtual);

        if(quantidadeAtual < limiteMinimo) {
            System.out.println("ALERTA estoque abaixo do limite mínimo ("+ limiteMinimo +")!");
            System.out.println("STATUS: Reposição IMEDIATA necessária!");
        } else {
            System.out.println("Estoque saudável!");
        }

        double valorTotalEstoque = quantidadeAtual * precoUnitario;
        System.out.printf("Valor total desse lote R$: %.2f%n ", valorTotalEstoque);
    }
}
