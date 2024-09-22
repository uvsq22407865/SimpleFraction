public class Fraction {

    private int numerateur;
    private int denominateur;

    // Constructeur avec numerateur et denominateur

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // Constructeur avec juste le numerateur
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1; // Denominateur par defaut
    }

    // Constructeur sans argument
    public Fraction() {
        this.numerateur = 0; // Numerateur par defaut
        this.denominateur = 1; // Denominateur par defaut
    }

    @Override
    public String toString() {
        return "je suis une fraction.";

    }

}