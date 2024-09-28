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

}
