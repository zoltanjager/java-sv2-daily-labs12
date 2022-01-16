package day04;

import day01.Run;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> subjectBlocks = new ArrayList<>();

    public void readAllLines(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                subjectBlocks.add(new SubjectBlock(line, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open the file", e);
        }
    }

    public int sumOfNumberOfLessonByName(String nameOfTeacher) {
        int sum = 0;
        for (SubjectBlock actual : subjectBlocks) {
            if (nameOfTeacher.equals(actual.getNameOfTeacher())) {
                sum += actual.getNumberOfLessons();
            }
        }
        return sum;
    }

    public List<SubjectBlock> getSubjectBlocks() {
        return new ArrayList<>(subjectBlocks);
    }
}
