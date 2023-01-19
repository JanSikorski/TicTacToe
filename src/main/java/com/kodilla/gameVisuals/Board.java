package com.kodilla.gameVisuals;

public class Board {

    private final char[][] board;
    public Board(int size) {
        this.board = new char[size][size];
    }

    public char[][] getBoard() {
        return board;
    }
    public char[] getBoardRow(int y) {
        return board[y];
    }
    public char getBoardElement(int x, int y) {
        return board[x][y];
    }
    public void setBoard(int x, int y, char character) {
        board[x][y] = character;
    }

    public int getBoardSize() {
        return getBoardRow(0).length;
    }

    public void showBoard() {
        StringBuilder gameBoard = new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                gameBoard.append(board[i][j]).append(" | ");
            }
            gameBoard.append("\n");
        }

        System.out.println(gameBoard);
    }
}
