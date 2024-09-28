package com.example.demo.services;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOFileService {
    public static void writeToFile(String text) {
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Erorr writing: " + e.getMessage());
        }
    }

    public static String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader("data.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading: " + e.getMessage());
            return null;
        }
        return content.toString();
    }
}
