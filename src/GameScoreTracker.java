public class GameScoreTracker {
    public static void main(String[] args) {
        int numberOfGames = 5; // Assuming there are 5 games
        TeamScores team1 = new TeamScores(numberOfGames);
        TeamScores team2 = new TeamScores(numberOfGames);
        team1.setScore(0, 10);
        team1.setScore(1, 15);
        team1.setScore(2, 20);
        team1.setScore(3, 25);
        team1.setScore(4, 30);

        team2.setScore(0, 12);
        team2.setScore(1, 18);
        team2.setScore(2, 24);
        team2.setScore(3, 28);
        team2.setScore(4, 35);

        System.out.println("Scores for Team 1:");
        team1.printScores();
        System.out.println("Total score for Team 1: " + team1.getTotalScore());

        System.out.println("\nScores for Team 2:");
        team2.printScores();
        System.out.println("Total score for Team 2: " + team2.getTotalScore());
    }
}
