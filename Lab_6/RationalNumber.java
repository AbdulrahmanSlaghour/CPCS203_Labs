public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numer, int denom) {
        numerator = numer;
        denominator = denom;
    }

    public RationalNumber add(RationalNumber op2) {
        int op1Numer = this.numerator;
        int op1Denom = this.denominator;

        int op2Numer = op2.getNumerator();
        int op2Denom = op2.getDenominator();

        int resultNumer = (op1Numer * op2Denom) + (op1Denom * op2Numer);
        int resultDenom = op1Denom * op2Denom;

        return new RationalNumber(resultNumer, resultDenom);
    }

    public RationalNumber multiply(RationalNumber op2) {
        int op1Numer = this.numerator;
        int op1Denom = this.denominator;

        int op2Numer = op2.getNumerator();
        int op2Denom = op2.getDenominator();

        int resultNumer = op1Numer * op2Numer;
        int resultDenom = op1Denom * op2Denom;

        return new RationalNumber(resultNumer, resultDenom);
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    
}
