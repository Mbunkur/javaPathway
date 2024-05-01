public class Card {
    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of card ("Hearts", "Diamonds", ...)

    // constructor
    public Card(String cardFace, String cardSuit) {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    }

    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }

    // return face of the card
    public String getFace() {
        return face;
    }

    // return suit of the card
    public String getSuit() {
        return suit;
    }
}
