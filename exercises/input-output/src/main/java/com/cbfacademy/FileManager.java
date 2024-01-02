package com.cbfacademy;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class FileManager {

    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    public void copy(String inputFile, String outputFile) {
        try {
            Path inputPath = Paths.get(inputFile);
            Path outputPath = Paths.get(outputFile);

            Files.createDirectories(outputPath.getParent());

            Files.copy(inputPath, outputPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reverseLines(String inputFile, String outputFile) {
        try {
            Path inputPath = Paths.get(inputFile);
            Path outputPath = Paths.get(outputFile);

            Files.createDirectories(outputPath.getParent());

            List<String> lines = Files.readAllLines(inputPath);
            Collections.reverse(lines);

            Files.write(outputPath, lines);

            System.out.println("Lines reversed and copied to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        // Example usage: Reverse lines and copy to a new file
        fileManager.reverseLines("exercise.txt", "reversed_exercise.txt");
    }
}
