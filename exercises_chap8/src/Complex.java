public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void add(Complex other) {
        this.realPart += other.realPart;
        this.imaginaryPart += other.imaginaryPart;
    }

    public void subtract(Complex other) {
        this.realPart -= other.realPart;
        this.imaginaryPart -= other.imaginaryPart;
    }

    public void print() {
        System.out.println("(" + realPart + ", " + imaginaryPart + ")");
    }

    // Getters and setters
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}
