package com.kodilla.gameMechanics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Results {

    Path path = Paths.get("/Users/jansikorski/dev/kodilla-course/TicTacToe/src/main/resources/results.txt");

    public void saveResult(String playerName, LocalDate date) throws NullPointerException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(), true))) {
            writer.write(playerName + " | " + date);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readResults() {
        try(Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
