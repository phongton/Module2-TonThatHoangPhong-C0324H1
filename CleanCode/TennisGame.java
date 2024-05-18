package CleanCode;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        if (scorePlayer1 == scorePlayer2) {
            return getEqualScore(scorePlayer1);
        } else if (isGameEnd(scorePlayer1, scorePlayer2)) {
            return getEndGameScore(scorePlayer1, scorePlayer2);
        } else {
            return getRegularScore(scorePlayer1) + "-" + getRegularScore(scorePlayer2);
        }
    }

    private static String getEqualScore(int score) {
        return switch (score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static boolean isGameEnd(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 >= 4 || scorePlayer2 >= 4;
    }

    private static String getEndGameScore(int scorePlayer1, int scorePlayer2) {
        int scoreDifference = scorePlayer1 - scorePlayer2;
        if (Math.abs(scoreDifference) == 1) {
            return (scoreDifference == 1) ? "Advantage player1" : "Advantage player2";
        } else {
            return (scoreDifference >= 2) ? "Win for player1" : "Win for player2";
        }
    }

    private static String getRegularScore(int score) {
        String[] scoreMapping = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreMapping[score];
    }

}
