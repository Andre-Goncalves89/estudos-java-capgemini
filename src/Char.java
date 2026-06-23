public class Char {
    private String nome;
    private double vida;
    private int level;

    public Char(String nome, double vida, int level) {
        this.nome = nome;
        this.vida = vida;
        this.level = level;
    }

    public String atacarBasico() {
        String ataqueBase = "Efetuou um ataque básico.";
        return ataqueBase;
    }

        public double getVida () {
            return vida;
        }

        public String getNome () {
            return nome;
        }

        public int getLevel () {
            return level;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
