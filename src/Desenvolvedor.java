public class Desenvolvedor extends Funcionario {
    private String tecnologiaPrincipal;

    public Desenvolvedor(String nome, double salarioBase, String tecnologiaPrincipal) {
        super(nome, salarioBase);
        this.tecnologiaPrincipal = tecnologiaPrincipal;
    }

    public String getTecnologiaPrincipal() {
        return tecnologiaPrincipal;
    }

    public void setTecnologiaPrincipal(String tecnologiaPrincipal) {
        this.tecnologiaPrincipal = tecnologiaPrincipal;
    }

    @Override
    public double calcularSalario() {
        if (getTecnologiaPrincipal().equals("Java")){
            return super.calcularSalario() + 500;
        }
        return super.calcularSalario();
    }
}
