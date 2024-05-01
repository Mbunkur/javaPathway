import java.util.ArrayList;
import java.util.Collections;

public class DeckCards {
    private ArrayList<Card> deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private static final String[] faces = {
            "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"
    };
    private static final String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
    };

    // constructor fills deck of Cards
    public DeckCards() {
        deck = new ArrayList<>(NUMBER_OF_CARDS); // create arraylist of cards
        currentCard = 0; // set currentCard so first Card dealt is deck[0]

        // populate deck with Card objects
        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            deck.add(new Card(faces[count % 13], suits[count / 13]));
        }
    }

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card and swap them
        for (int first = 0; first < deck.size(); first++) {
            // select a random number between 0 and 51
            int second = (int) (Math.random() * NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Collections.swap(deck, first, second);
        }
    }

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.size()) {
            // return current Card in array
            return deck.get(currentCard++);
        } else {
            return null; // return null to indicate that all Cards were dealt
        }
    }
}
