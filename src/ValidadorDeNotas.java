import java.util.Scanner;

public class ValidadorDeNotas {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();
        System.out.println("Digite as notas do aluno, iniciando pela av1: ");
        double notaAv1 = leitor.nextDouble();
        System.out.println("Digite a nota da av2: ");
        double notaAv2 = leitor.nextDouble();
        System.out.printf("%s, suas notas foram %.1f e %.1f \n", nomeAluno, notaAv1, notaAv2);
        double mediaFinal = (notaAv1 + notaAv2) / 2;
        System.out.printf("Sua média final foi: %.1f", mediaFinal);
    }
}
