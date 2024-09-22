public class Main {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(8, 16);
        Fraction fraction4 = new Fraction(5, 7);
        assert fraction1.equals(fraction4) : "Test échoué pour l'égalité de 8/16 et 5/7";

        assert fraction1.toString().equals("8/16") : "Test echoue pour fraction1";
        assert fraction1.doubleValue() == 0.5 : "Test échoué pour fraction1";

        Fraction fraction2 = new Fraction(7);
        assert fraction2.toString().equals("7/1") : "Test echoue pour fraction1";
        assert fraction1.doubleValue() == 7.0 : "Test échoué pour fraction1";

        Fraction fraction3 = new Fraction();
        assert fraction3.toString().equals("0/1") : "Test echoue pour fraction1";
        assert fraction1.doubleValue() == 0.0 : "Test échoué pour fraction1";

        Fraction resultat = fraction1.add(fraction2);
        assert resultat.toString().equals("120/16") : "Test échoué pour l'addition de 8/16 et 7/1";

        System.out.println("Tous les tests sont passes !");
    }

}
