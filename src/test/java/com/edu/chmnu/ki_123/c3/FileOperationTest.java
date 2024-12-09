package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileOperationTest {
    @Test
    public void testReadNumbersFromFile() throws IOException {
        Path tempFile = Files.createTempFile("input1", ".txt");
        Files.write(tempFile, "12 45 65 43 23".getBytes());

        List<Integer> numbers = FileOperation.readNumbersFromFile(tempFile.toString());

        assertEquals(List.of(12, 45, 65, 43, 23), numbers);

        Files.delete(tempFile);
    }

    @Test
    public void testWriteNumbersToFile() throws IOException {
        Path tempFile = Files.createTempFile("output1", ".txt");

        List<Integer> numbers = List.of(14, 56, 5, 7, 13);
        FileOperation.writeNumbersToFile(numbers, tempFile.toString());

        String fileContent = Files.readString(tempFile);
        assertEquals("14 56 5 7 13", fileContent.trim());

        Files.delete(tempFile);
    }

    @Test
    public void testReadInvalidFile() {
        assertThrows(IOException.class, () -> FileOperation.readNumbersFromFile("good.txt"),
                "Skip");
    }

}