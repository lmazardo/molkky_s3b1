import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MolkkyGameTest {

    @org.junit.Test
    public void canGetScore() {
        MolkyGame game = new MolkyGame();

        assertEquals(0, game.score());
    }

    @Test
    public void canKnockOverOnePin() {
        MolkyGame game = new MolkyGame();

        game.knockOver(2);

        assertEquals(2, game.score());
    }

    @Test
    public void canKnockOverTwice() {
        MolkyGame game = new MolkyGame();

        game.knockOver(5); // => 5
        game.knockOver(5); // => 5

        assertEquals(10, game.score());
    }

    @Test
    public void canKnockOverTwoPins() {
        MolkyGame game = new MolkyGame();

        game.knockOver(6, 11);

        assertEquals(2, game.score());

    }

    @Test
    public void canKonckOverTwiceTwoPins() {
        MolkyGame game = new MolkyGame();

        game.knockOver(6);
        game.knockOver(6, 11);

        assertEquals(8, game.score());

    }
}
