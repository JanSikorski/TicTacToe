package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

import java.util.Random;
import java.util.Scanner;

public class ComputerPlayerMechanics {
    private final Random RANDOM = new Random();
    private final Player computer = new Player();
    private final Player player;
    private final Board board;
    private final Checks checks = new Checks();
    private final Scanner SCANNER = new Scanner(System.in);

    public ComputerPlayerMechanics(Board board, Player player) {
        this.board = board;
        this.player = player;
    }


    public void introducePlayer() {
        System.out.println("Player 1 name:");
        player.setPlayer(SCANNER.nextLine());
        player.setCharacter('X');
    }

    public void introduceComputerPlayer() {
        computer.setPlayer("Computer");
        computer.setCharacter('O');
    }

    public Player getComputerPlayer() {
        return computer;
    }

    public Board computerTurn() {
        System.out.println(computer.getPlayer() + " turn: ");

        int[] position = new int[2];

        while (true) {
            position[0] = RANDOM.nextInt(board.getBoardSize()-1);
            position[1] = RANDOM.nextInt(board.getBoardSize()-1);

            if (checks.placeUsedTest(board, position[0], position[1])) {
                board.setBoard(position[0], position[1], computer.getCharacter());
                return board;
            }
        }
    }
}
