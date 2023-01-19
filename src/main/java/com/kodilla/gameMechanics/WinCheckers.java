package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

public class WinCheckers {
    int points = 0;
    private final Board board;

    public WinCheckers(Board board) {
        this.board = board;
    }

    public boolean checkWin(char character) {


        for (int i = 0; i < board.getBoardSize(); i++){
            for (int j = 0; j < board.getBoardSize(); j++) {
                if (board.getBoard()[i][j] != character) {
                    points = 0;
                    break;
                } else {
                    points++;
                }
                if (points == 5 && board.getBoardSize() == 10){
                    return true;
                } else if (points == 3 && board.getBoardSize() == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < board.getBoardSize(); i++){
            for (int j = 0; j < board.getBoardSize(); j++) {
                if (board.getBoard()[j][i] != character) {
                    points = 0;
                    break;
                } else {
                    points++;
                }
                if (points == 5 && board.getBoardSize() == 10) {
                    return true;
                } else if (points == 3 && board.getBoardSize() == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < board.getBoardSize(); i++){
            if (board.getBoard()[i][i] != character){
                points = 0;
                break;
            } else {
                points++;
            }
            if (points == 5 && board.getBoardSize() == 10){
                return true;
            } else if (points == 3 && board.getBoardSize() == 3) {
                return true;
            }
        }

        for (int i = 0; i< board.getBoardSize(); i++){
            if (board.getBoard()[i][(board.getBoardSize()-1)-i] != character) {
                points = 0;
                break;
            } else {
                points++;
            }
            if (points == 5 && board.getBoardSize() == 10){
                return true;
            } else if (points == 3 && board.getBoardSize() == 3) {
                return true;
            }
        }

        return false;
    }
}
