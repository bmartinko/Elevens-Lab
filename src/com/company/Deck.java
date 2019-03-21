package com.company;
import java.util.List;
import java.util.ArrayList;

public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;
    private String[] rank;
    private String[] suit;
    private int[] value;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
<<<<<<< HEAD
        cards = new ArrayList<>();
=======
>>>>>>> origin/master
        for( int q = 0; q < suits.length; q++){
            for (int y = 0; y < ranks.length; y++){
                Card boi = new Card(ranks[y], suits[q], values[y]);
                cards.add(boi);
            }
        }
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        return cards.size() == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
<<<<<<< HEAD
        size = cards.size();
        return size;
=======
        return cards.size();
>>>>>>> origin/master
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
<<<<<<< HEAD
        return cards.get(cards.size() - 1);
=======
    return cards.get(cards.size() - 1);
>>>>>>> origin/master
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
