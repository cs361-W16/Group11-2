package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by danielgoh on 2/16/16.
 */
public class SpanishGame extends Game {


    // Spanish Game Constructor
    public SpanishGame()
    {
        super();
        cardsLeft = 40;
    }

    // buildDeck for Spanish Game
    public void buildDeck() {
        for(int i = 1; i < 14; i++){
            if (i < 8 || i > 10) {
                deck.add(new Card(i, Suit.Clubs));
                deck.add(new Card(i, Suit.Cups));
                deck.add(new Card(i, Suit.Coins));
                deck.add(new Card(i, Suit.Swords));
            }
        }
    }




}
