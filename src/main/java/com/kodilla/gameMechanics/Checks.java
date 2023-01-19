package com.kodilla.gameMechanics;

import com.kodilla.gameVisuals.Board;

import java.util.Scanner;

public class Checks {

    public boolean placeUsedTest(Board board, int x, int y) {
        return board.getBoardElement(x, y) != 'X' && board.getBoardElement(x, y) != 'O';
    }


    public boolean checkRemis(Board board) {

        boolean isNotAllOccupied = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getBoardElement(i, j) != 'X' && board.getBoardElement(i, j) != 'O'){
                    isNotAllOccupied = false;
                }
            }
        }
        return isNotAllOccupied;
    }

    public boolean askIfContinue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue (y/n)");

        String answer = scanner.nextLine();

        while (true) {
            if (answer.equals("y")) {
                return true;
            } else if (answer.equals("n")) {
                return false;
            } else {
                System.out.println("wrong input option! y = yes, n = no");
            }
        }
    }
}
