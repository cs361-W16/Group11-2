package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danielgoh on 2/16/16.
 */
public class testSpanishGame {

    @Test
    public void testGameCreation(){
        Game g = new SpanishGame();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        Game g = new SpanishGame();
        assertEquals(40,g.deck.size());
    }

    @Test
    public void testGameInit(){
        Game g = new SpanishGame();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        Game g = new SpanishGame();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testRemoveFunction(){
        Game g = new SpanishGame();
        g.customDeal(0,3,6,13);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.remove(3);
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testMove(){
        Game g = new SpanishGame();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0 ,g.cols.get(2).size());
        g.move(1, 2);
        assertEquals(0 ,g.cols.get(1).size());
    }

    @Test
    public void testScore(){
        Game g = new SpanishGame();
        g.customDeal(0,3,6,9);
        assertEquals(0,g.score);
        g.remove(2);
        assertEquals(1,g.score);
    }
}
