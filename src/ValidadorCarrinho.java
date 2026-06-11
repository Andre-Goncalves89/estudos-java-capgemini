public class ValidadorCarrinho {
    static void main(String[] args) {
        Produto notebook = new Produto();
        Produto celular = new Produto();
        Produto mouse = new Produto();

        notebook.nome = "Notebook_ASUS_vivoBook_ARM64";
        notebook.preco = 5500.1;

        celular.nome = "Motorola_A72";
        celular.preco = 4999.99;

        mouse.nome = "mouse_Multilaser_2000";
        mouse.preco = 185.90;

        boolean ehVip = true;
        double valorTotalCompra = 1.0;
        double precoComDesconto =  1.0;
        double desconto = 0;
        valorTotalCompra = celular.preco + mouse.preco;
        double valorDoDesconto = 1.0;

        //criando calculo de desconto
        // Definindo apenas a regra do cupom de desconto
        if (ehVip && valorTotalCompra > 5000) {
            desconto = 15;
            System.out.printf("Compra de R$ %.2f ,15 por cento de desconto aplicado!!", valorTotalCompra);
        } else if (!ehVip && valorTotalCompra > 5000) {
            desconto = 10; // Mudando para a sua versão do segundo teste
            System.out.printf("Compra de R$ %.2f ,10 por cento de desconto aplicado!!", valorTotalCompra);
        } else {
            desconto = 0;
            System.out.printf("Compra de R$ %.2f ,Nenhum desconto aplicado!!", valorTotalCompra);
        }

// A matemática acontece uma única vez para todos os cenários!
        valorDoDesconto = valorTotalCompra * (desconto / 100);
        precoComDesconto = valorTotalCompra - valorDoDesconto;
    }
}
