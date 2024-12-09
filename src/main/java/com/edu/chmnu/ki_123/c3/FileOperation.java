package com.edu.chmnu.ki_123.c3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

    public static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String number : line.split("\\s+")) {
                    try {
                        numbers.add(Integer.parseInt(number));
                    } catch (NumberFormatException e) {
                        System.err.println("Skip: " + number);
                    }
                }
            }
        }
        return numbers;
    }

    public static void writeNumbersToFile(List<Integer> numbers, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int number : numbers) {
                writer.write(number + " ");
            }
        }
    }
}

