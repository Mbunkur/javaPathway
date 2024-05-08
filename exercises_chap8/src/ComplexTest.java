public class ComplexTest {
    public static void main(String[] args) {
        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(2.0, -1.0);

        System.out.println("Complex number 1: ");
        complex1.print();
        System.out.println("Complex number 2: ");
        complex2.print();

        System.out.println("Adding complex numbers:");
        complex1.add(complex2);
        complex1.print();

        System.out.println("Subtracting complex numbers:");
        complex1.subtract(complex2);
        complex1.print();
    }
}
