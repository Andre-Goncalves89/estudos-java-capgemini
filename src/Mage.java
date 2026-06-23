public class Mage extends Char{
    private double mana;

    public Mage(String nome, double vida, int level, double mana) {
        super(nome, vida, level);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public String atacarBasico() {
        double custoMana = 100.0;

        if (this.mana < custoMana) {
            return String.format("%s tentou lançar Bola de Fogo, mas está sem mana suficiente!", getNome());
        }

        this.mana -= custoMana;
        return String.format("%s Lançou uma Bola de Fogo! (mana restante: %.0f)", getNome(), getMana());
    }
}
