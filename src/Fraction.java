public class Fraction implements FractionInterface {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public double getDecValue(Fraction fractionex){
        System.out.println(fractionex.numerator / fractionex.denominator);
        return 0;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator <= 0) {
            System.out.println("Знаменатель не может быть равен 0 или быть меньше его. Ваш знаменатель будет заменен на 1");
            denominator = 1;
        }
        this.denominator = denominator;
    }


    public static boolean areEqual(Fraction f1, Fraction f2) {
        return ((f1.getDenominator() == f2.getDenominator()) && (f2.getNumerator() == f1.getNumerator()));
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static int generateHashCode(Fraction fraction) {
        return Integer.hashCode(fraction.getNumerator()/Integer.hashCode(fraction.getDenominator()));
    }
}