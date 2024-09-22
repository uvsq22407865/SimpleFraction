public class Main {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(8, 16);
        assert fraction1.toString().equals("8/16") : "Test echoue pour fraction1";

        Fraction fraction2 = new Fraction(7);
        assert fraction2.toString().equals("7/1") : "Test echoue pour fraction1";

        Fraction fraction3 = new Fraction();
        assert fraction3.toString().equals("0/1") : "Test echoue pour fraction1";

        System.out.println("Tous les tests sont passes !");
    }

}
