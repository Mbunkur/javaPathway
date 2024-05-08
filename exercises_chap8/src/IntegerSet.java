public class IntegerSet {
    private boolean[] set;

    public IntegerSet() {
        set = new boolean[101]; // Initialize the array to hold integers in the range 0-100
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < unionSet.set.length; i++) {
            unionSet.set[i] = set1.set[i] || set2.set[i];
        }
        return unionSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < intersectionSet.set.length; i++) {
            intersectionSet.set[i] = set1.set[i] && set2.set[i];
        }
        return intersectionSet;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                result.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "---" : result.toString();
    }

    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}
