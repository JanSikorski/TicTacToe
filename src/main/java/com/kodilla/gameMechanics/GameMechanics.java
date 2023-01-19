package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

import java.util.Scanner;

public class GameMechanics {

    private final Board board;
    private final Player player1;
    private final Player player2;
    private final WinCheckers winCheckers;

    public GameMechanics(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        winCheckers = new WinCheckers(board);
    }
    Scanner SCANNER = new Scanner(System.in);
    Checks checks = new Checks();



    public void introducePlayer(Player player, int i, char symbol) {
        System.out.println("Player " + i + " name:");
        player.setPlayer(SCANNER.nextLine());
        player.setCharacter(symbol);
    }

    public int[] getPositionInput() {
        int[] positions = new int[2];

        String positionX, positionY;

        while (true) {
            System.out.print("x: ");
            positionX = SCANNER.nextLine();
            System.out.print("y: ");
            positionY = SCANNER.nextLine();

            try {
                positions[0] = Integer.parseInt(positionY);
                positions[1] = Integer.parseInt(positionX);
                return positions;
            } catch (NumberFormatException e){
                System.out.println("Wrong input format, try again");
            }
        }
    }

    public Board turn(Player player) {



        while (true) {
            try {
                System.out.println(player.getPlayer() + " turn: ");
                int[] position = getPositionInput();
                if (checks.placeUsedTest(board, position[0], position[1])) {
                    board.setBoard(position[0], position[1], player.getCharacter());
                    return board;
                } else {
                    System.out.println("Provided position is already taken.\n" +
                            "Please pick another one: ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Picked position is out of bounds");
            }
        }
    }


    public boolean endGame(Board board) {

        if (winCheckers.checkWin('X')) {
            System.out.println("Player: " + player1.getPlayer() + " winns");
            return true;
        } else if (winCheckers.checkWin('O')){
            System.out.println("Player: " + player2.getPlayer() + " winns");
            return true;
        } else if (checks.checkRemis(board)){
            System.out.println("Remis");
            return true;
        } else {
            return false;
        }
    }
}
