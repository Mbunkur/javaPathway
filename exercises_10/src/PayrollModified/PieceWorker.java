package PayrollModified;

// PieceWorker class
public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return String.format("Piece Worker: %s%nWage per Piece: $%.2f%nPieces Produced: %d", super.toString(), wage, pieces);
    }
}

