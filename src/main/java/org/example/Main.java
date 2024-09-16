package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        ExamDAO examDAO = new ExamDAO();

        Student agrin = new Student("Agrin Sadon");
        Student muath = new Student(" Muath Othman");

        studentDAO.saveStudent(agrin);
        studentDAO.saveStudent(muath);

        examDAO.saveExam(new Exam(agrin, 4));
        examDAO.saveExam(new Exam(agrin, 5));
        examDAO.saveExam(new Exam(muath, 1));
        examDAO.saveExam(new Exam(muath, 2));

        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            student.getExams().forEach(exam -> System.out.println(" - Exam Grade: " + exam.getGrade()));
        }
    }
}

