public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(0, 1); // Default to 0/1
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        // Ensure the negative sign is on the numerator
        if (this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    // Find greatest common divisor using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int num = r1.numerator * r2.denominator;
        int denom = r1.denominator * r2.numerator;
        return new Rational(num, denom);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toFloatingPointString(int precision) {
        double result = (double) numerator / denominator;
        return String.format("%." + precision + "f", result);
    }
}
