package day04;

import java.util.Objects;

public class SubjectBlock {
    private String nameOfTeacher;
    private String subject;
    private String nameOfClass;
    private int numberOfLessons;

    public SubjectBlock(String nameOfTeacher, String subject, String nameOfClass, int numberOfLessons) {
        this.nameOfTeacher = nameOfTeacher;
        this.subject = subject;
        this.nameOfClass = nameOfClass;
        this.numberOfLessons = numberOfLessons;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    @Override
    public String toString() {
        return "SubjectBlock{" +
                "nameOfTeacher='" + nameOfTeacher + '\'' +
                ", subject='" + subject + '\'' +
                ", nameOfClass='" + nameOfClass + '\'' +
                ", numberOfLessons=" + numberOfLessons +
                '}';
    }
}
