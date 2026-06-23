import java.util.Scanner;

public class Empresa {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario [] listaFuncionarios = new Funcionario[2];
        listaFuncionarios[0] = new Gerente("Caio", 7300, 1000);
        listaFuncionarios[1] = new Desenvolvedor("Andre", 5000, "Java");
        for(Funcionario f:  listaFuncionarios ) {
            System.out.printf("\nFuncionário: %s. \n salário R$ %.2f", f.getNome(), f.calcularSalario());
        }
    }
}
