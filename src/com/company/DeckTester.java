package com.company;

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] rankz = {"jack", "queen", "king"};
        String[] suitz = {"blue", "red"};
        int[] pointValuez = {11, 12, 13};
        Deck d = new Deck(rankz, suitz, pointValuez);
        System.out.println(d.toString());
    }
}
