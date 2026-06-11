public class Produto {
    String nome;
    double preco;
    int quantidade;
    boolean vip;

    public void exibirProduto() {
        System.out.printf("Item: %s | QTD: %d | preço R$ %.2f%n", nome, quantidade, preco);
    }
}
