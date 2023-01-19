package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameMechanicsForBoard3TestSuite {

    private int boardSize = 3;

    @Test
    void endGameTestXFirstRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());

        //When
        for (int i = 0; i < 3; i++) {
                board.setBoard(i, 0, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXSecondRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, 1, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXThirdRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, 2, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXFirstColum() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(0, i, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXSecondColumn() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(1, i, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXThirdColumn() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(2, i, 'X');
        }

        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXleftDiagonal() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, i, 'X');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestXRightDiagonal() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 2; i >= 0; i--) {
            board.setBoard(i, i, 'X');
        }

        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOFirstRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, 0, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOSecondRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, 1, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOThirdRow() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, 2, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOFirstColum() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(0, i, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOSecondColumn() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(1, i, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOThirdColumn() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(2, i, 'O');
        }

        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestOleftDiagonal() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 0; i < 3; i++) {
            board.setBoard(i, i, 'O');
        }
        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameTestORightDiagonal() {
        //Given
        Board board = new Board(boardSize);
        GameMechanics gameMechanics = new GameMechanics(board, new Player(), new Player());
        //When
        for (int i = 2; i >= 0; i--) {
            board.setBoard(i, i, 'O');
        }

        //Then
        assertEquals(true, gameMechanics.endGame(board));
    }

    @Test
    void endGameRemisTest() {
        //Given
        Board board = new Board(boardSize);
        Checks checks = new Checks();
        //When
        board.setBoard(0, 0, 'X');
        board.setBoard(0, 1,'X');
        board.setBoard(0, 2, 'O');
        board.setBoard(1, 0, 'O');
        board.setBoard(1, 1, 'X');
        board.setBoard(1, 2, 'X');
        board.setBoard(2, 0, 'X');
        board.setBoard(2, 1, 'O');
        board.setBoard(2, 2, 'O');
        //Then
        assertEquals(true, checks.checkRemis(board));
    }
}
