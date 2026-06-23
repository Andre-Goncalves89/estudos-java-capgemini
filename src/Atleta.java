public class Atleta extends Pessoa{

    private String esportePraticado;

    public Atleta(String nome, double altura, double peso, String esportePraticado) {
        super(nome, altura, peso);
        this.esportePraticado = esportePraticado;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    @Override
    public String toString() {
        return "Atleta{nome='" + getNome() + "', esporte='" + esportePraticado + "'}";
    }
}
