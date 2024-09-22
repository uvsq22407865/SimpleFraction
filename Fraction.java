public class Fraction {

    private int numerateur;
    private int denominateur;

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

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

    public int getNumerateur() {
        return numerateur; // Retourne le numerateur
    }

    public int getDenominateur() {
        return denominateur;
    }

    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    public Fraction add(Fraction frac) {
        int newnumerateur = this.numerateur * frac.denominateur + this.denominateur * frac.numerateur;
        int newdenominateur = this.denominateur * frac.denominateur;
        return new Fraction(newnumerateur, newdenominateur);
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Fraction fract = (Fraction) obj;

        // Comparaison des produits croisés pour vérifier l'égalité des fractions
        return this.numerateur * fract.denominateur == this.denominateur * fract.numerateur;
    }

    @Override
    public String toString() {
        return "je suis une fraction.";

    }

    public int comparerfrac(Fraction autreFraction) {
        // Comparaison des produits croisés pour déterminer l'ordre naturel
        int thisCrossProduct = this.numerateur * autreFraction.denominateur;
        int autreCrossProduct = this.denominateur * autreFraction.numerateur;

        return Integer.compare(thisCrossProduct, autreCrossProduct);
    }

}