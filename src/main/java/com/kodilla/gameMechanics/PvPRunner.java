package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

import java.time.LocalDate;

public class PvPRunner {

    public void run(int size) {

        Player player1 = new Player();
        Player player2 = new Player();

        Board board = new Board(size);
        GameMechanics gameMechanics = new GameMechanics(board, player1, player2);
        Results results = new Results();
        Checks checks = new Checks();

        gameMechanics.introducePlayer(player1, 1, 'X');
        gameMechanics.introducePlayer(player2, 2, 'O');

        while (true) {
            board = new Board(size);
            gameMechanics = new GameMechanics(board, player1, player2);

            boolean gameState = false;
            board.showBoard();

            while (!gameState){
                board = gameMechanics.turn(player1);
                board.showBoard();
                if (gameState = gameMechanics.endGame(board)) {
                    results.saveResult(player1.getPlayer(), LocalDate.now());
                    break;
                }
                board = gameMechanics.turn(player2);
                board.showBoard();
                if (gameState = gameMechanics.endGame(board)) {
                    results.saveResult(player2.getPlayer(), LocalDate.now());
                    break;
                }
            }
            if (!checks.askIfContinue()){
                break;
            }
        }
    }
}
