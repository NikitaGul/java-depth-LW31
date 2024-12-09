package com.edu.chmnu.ki_123.c3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {

            List<Integer> numbers = FileOperation.readNumbersFromFile(inputFilePath);


            var primeNumbers = NumberFind.filterPrimes(numbers);


            FileOperation.writeNumbersToFile(primeNumbers, outputFilePath);

            System.out.println("Simple number have written in: " + outputFilePath);
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
    }
}