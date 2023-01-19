package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

import java.time.LocalDate;

public class PvERunner {

    public void run(int size) {

        Board board = new Board(size);
        Player player = new Player();
        ComputerPlayerMechanics computerPlayerMechanics = new ComputerPlayerMechanics(board, player);
        GameMechanics gameMechanics;
        Results results = new Results();
        Checks checks = new Checks();

        computerPlayerMechanics.introducePlayer();

        while (true) {

            board = new Board(size);
            computerPlayerMechanics = new ComputerPlayerMechanics(board, player);
            gameMechanics = new GameMechanics(board, player, computerPlayerMechanics.getComputerPlayer());
            computerPlayerMechanics.introduceComputerPlayer();
            boolean gameState = false;
            board.showBoard();

            while (!gameState) {
                board = gameMechanics.turn(player);
                board.showBoard();
                if (gameState = gameMechanics.endGame(board)) {
                    results.saveResult(player.getPlayer(), LocalDate.now());
                    break;
                }
                board = computerPlayerMechanics.computerTurn();
                board.showBoard();
                if (gameState = gameMechanics.endGame(board)) {
                    results.saveResult(computerPlayerMechanics.getComputerPlayer().getPlayer(), LocalDate.now());
                    break;
                }
            }
            if (!checks.askIfContinue()){
                break;
            }
        }
    }
}
