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


    private int score = 0;
}
