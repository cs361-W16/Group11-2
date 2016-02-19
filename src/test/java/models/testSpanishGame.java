package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danielgoh on 2/16/16.
 */
public class testSpanishGame {

    @Test
    public void testGameCreation(){
        SpanishGame g = new SpanishGame();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        SpanishGame g = new SpanishGame();
        g.buildDeck();
        assertEquals(40,g.deck.size());
    }


}
