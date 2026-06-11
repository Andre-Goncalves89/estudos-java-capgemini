public class Principal {
    static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Iphone_16";
        p1.preco = 7500.99;
        p1.quantidade = 6;

        Produto p2 = new Produto();
        p2.nome = "Notebook_Asus_ARM64";
        p2.preco = 5500.10;
        p2.quantidade = 2;

        Produto p3 = new Produto();
        p3.nome = "Mouse_Multilaser";
        p3.preco = 89.90;
        p3.quantidade = 25;

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();
    }
}
