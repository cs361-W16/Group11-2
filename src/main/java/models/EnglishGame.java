package models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * Created by user on 2016/02/19.
 */
public class EnglishGame extends Game {

    public EnglishGame(){
        super();
        cardsLeft = 52;
    }

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }
}
