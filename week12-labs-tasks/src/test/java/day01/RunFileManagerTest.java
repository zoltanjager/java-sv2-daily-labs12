package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunFileManagerTest {

    @Test
    void testReadAllLines() {
        RunFileManager runFileManager = new RunFileManager();

        runFileManager.readAllLines("src/test/resources/running.csv");

        assertEquals(7, runFileManager.getRunData().size());

    }
    @Test
    void testSumOfMonthAndYear() {
        RunFileManager runFileManager = new RunFileManager();
        runFileManager.readAllLines("src/test/resources/running.csv");
        Double result = runFileManager.sumOfMonthAndYear(2021, LocalDate.of(2021,12,01).getMonth());

        assertEquals(41.2, result);

    }

}