package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        if (handSign == ROCK) {
            winningMove = PAPER;
        }
        if (handSign == PAPER) {
            winningMove = SCISSOR;
        }
        if (handSign == SCISSOR) {
            winningMove = ROCK;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        if (handSign == ROCK) {
            losingMove = SCISSOR;
        }
        if (handSign == PAPER) {
            losingMove = ROCK;
        }
        if (handSign == SCISSOR) {
            losingMove = PAPER;
        }
        return losingMove;
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1 == ROCK && handSignOfPlayer2 == PAPER || handSignOfPlayer1 == PAPER && handSignOfPlayer2 == SCISSOR || handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == ROCK) {
            winner = handSignOfPlayer2;
        }
        if (handSignOfPlayer1 == PAPER && handSignOfPlayer2 == ROCK || handSignOfPlayer1 == ROCK && handSignOfPlayer2 == SCISSOR || handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == PAPER) {
            winner = handSignOfPlayer1;
        }
            return winner;
    }
}
