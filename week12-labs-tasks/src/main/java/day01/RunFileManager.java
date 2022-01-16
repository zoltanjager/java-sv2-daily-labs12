package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunFileManager {
    private List<Run> runData = new ArrayList<>();



    public void readAllLines(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                Run run = crateRunObjectFromLine(line);
                runData.add(run);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open the file", e);
        }
    }

    public double sumOfMonthAndYear(int year, Month month) {
        double sum = 0;
        for (Run actual : runData) {
            if (actual.getDate().getYear() == year && actual.getDate().getMonth() == month) {
                sum += actual.getKm();
            }
        }
        return sum;
    }

    private Run crateRunObjectFromLine(String line) {
        String[] temp = line.split(" km;");
        return new Run(Double.parseDouble(temp[0]), LocalDate.parse(temp[1]));
    }

    public List<Run> getRunData() {
        return new ArrayList<>(runData);
    }

}
