public class Fraction extends Number implements Comparable<Fraction> {
    private int numerateur;
    private int denominateur;

    // Constructeur
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Fraction autreFraction = (Fraction) obj;

        // Comparaison des produits croises
        return this.numerateur * autreFraction.denominateur == this.denominateur * autreFraction.numerateur;
    }

    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    public int comparerfrac(Fraction autreFraction) {
        // Comparaison
        int thisCrossProduct = this.numerateur * autreFraction.denominateur;
        int autreCrossProduct = this.denominateur * autreFraction.numerateur;

        return Integer.compare(thisCrossProduct, autreCrossProduct);
    }

    public Fraction add(Fraction autreFraction) {
        int newNumerator = this.numerateur * autreFraction.denominateur + autreFraction.numerateur * this.denominateur;
        int newDenominator = this.denominateur * autreFraction.denominateur;
        return new Fraction(newNumerator, newDenominator);
    }

    // Methode pour comparer les fractions selon l'ordre naturel
    @Override
    public int compareTo(Fraction autreFraction) {
        return comparerfrac(autreFraction);
    }

    // Méthodes de la classe Number
    @Override
    public int intValue() {
        return (int) doubleValue(); // Conversion en entier
    }

    @Override
    public long longValue() {
        return (long) doubleValue(); // Conversion en long
    }

    @Override
    public float floatValue() {
        return (float) doubleValue(); // Conversion en float
    }

    @Override
    public double doubleValue() {
        return (double) numerateur / denominateur; // Conversion en double
    }
}
