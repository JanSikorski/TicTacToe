package com.kodilla.gameVisuals;

import com.kodilla.gameMechanics.PvERunner;
import com.kodilla.gameMechanics.PvPRunner;
import com.kodilla.gameMechanics.Results;

import java.util.Scanner;

public class GameMenu {

    public void printingMenu() {

        Scanner scanner = new Scanner(System.in);
        Results results = new Results();

        PvERunner pvERunner = new PvERunner();
        PvPRunner pvPRunner = new PvPRunner();

        boolean toContinue = true;
        int mode;
        while (toContinue) {
            while (true) {
                System.out.println("Welcome to the tic tac toe game\n" +
                        "Select game mode:\n" +
                        "1. Vs. computer\n" +
                        "2. Vs. player\n" +
                        "3. Results\n" +
                        "4. Quit");

                String modeSelect = scanner.nextLine();

                try {
                    mode = Integer.parseInt(modeSelect);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input format, try again");
                }
            }

            switch (mode){
                case 1:
                    System.out.println("Vs. computer\n" +
                            "Select board size:\n" +
                            "1. 3X3\n" +
                            "2.10X10");

                    int sizeSelect = scanner.nextInt();
                    switch (sizeSelect) {
                        case 1:
                            pvERunner.run(3);
                            break;
                        case 2:
                            pvERunner.run(10);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Vs. Player\n" +
                            "Select board size:\n" +
                            "1. 3X3\n" +
                            "2.10X10");

                    sizeSelect = scanner.nextInt();
                    switch (sizeSelect) {
                        case 1:
                            pvPRunner.run(3);
                            break;
                        case 2:
                            pvPRunner.run(10);
                            break;
                    }
                    break;
                case 3:
                    results.readResults();
                    break;
                case 4:
                    System.out.println("Quit...");
                    toContinue = false;
                    break;
            }
        }

    }
}
