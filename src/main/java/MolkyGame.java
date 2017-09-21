public class MolkyGame {
    public int score() {
        return score;
    }

    public void knockOver(int... i) {

        if (i.length == 1) {
            score += i[0];
        } else {
            score += i.length;
        }
    }

    public boolean won() {
        if ( score > 50 )
        {
            score = 25;
        }
        if ( score == 50)
        {
            won = true;
        }
        return won;
    }

    private boolean won = false;
    private int score = 0;
}
