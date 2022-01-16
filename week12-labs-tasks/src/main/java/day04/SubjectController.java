package day04;

public class SubjectController {

    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService();
        subjectService.readAllLines("src/test/resources/beosztas.txt");
        System.out.println(subjectService.getSubjectBlocks().size());
        System.out.println(subjectService.getSubjectBlocks());
        System.out.println(subjectService.sumOfNumberOfLessonByName("Albatrosz Aladin"));
    }
}
