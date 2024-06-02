package Shape;

// Concrete class Tetrahedron
public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) / 12) * side * side * side;
    }
}

