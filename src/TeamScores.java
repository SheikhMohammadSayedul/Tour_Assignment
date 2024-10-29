public class TeamScores {
    private int[] scores;

    public TeamScores(int numberOfGames) {
        scores = new int[numberOfGames];
    }

    public void setScore(int gameIndex, int score) {
        if (gameIndex >= 0 && gameIndex < scores.length) {
            scores[gameIndex] = score;
        } else {
            System.out.println("Invalid game index");
        }
    }

    public int getTotalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public void printScores() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Game " + (i + 1) + ": " + scores[i]);
        }
    }
}
