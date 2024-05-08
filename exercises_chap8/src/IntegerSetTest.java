public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Insert some elements into set1
        set1.insertElement(5);
        set1.insertElement(10);
        set1.insertElement(20);

        // Insert some elements into set2
        set2.insertElement(10);
        set2.insertElement(15);
        set2.insertElement(20);

        // Test toString method
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());

        // Test union method
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet.toString());

        // Test intersection method
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet.toString());

        // Test deleteElement method
        set1.deleteElement(5);
        System.out.println("After deleting 5 from Set 1: " + set1.toString());

        // Test isEqualTo method
        System.out.println("Is Set 1 equal to Set 2? " + set1.isEqualTo(set2));
    }
}
