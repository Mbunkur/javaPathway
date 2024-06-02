package Shape;

// Main program
public class ShapeTest {
    public static void main(String[] args) {
        // Array of Shape references
        Shape[] shapes = new Shape[6];

        // Instantiate objects of each concrete class in the hierarchy
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Triangle(3, 4);
        shapes[3] = new Sphere(3);
        shapes[4] = new Cube(4);
        shapes[5] = new Tetrahedron(5);

        // Process each shape in the array
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");

            if (shape instanceof TwoDimensionalShape) {
                // Display area for two-dimensional shapes
                System.out.println("Area: " + shape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                // Display area and volume for three-dimensional shapes
                System.out.println("Surface Area: " + shape.getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }

            System.out.println(); // Add a line break between shapes
        }
    }
}
