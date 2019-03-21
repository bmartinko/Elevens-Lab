package com.company;

public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card a = new Card("10", "Spade", 10);
        Card b = new Card("Ace", "Club", 1);
        Card c = new Card("2", "Heart", 2);
        String s = a.rank();
        System.out.println(s);
    }
}
