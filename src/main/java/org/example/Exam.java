package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "grade", nullable = false)
    private int grade;

    public Exam() {}

    public Exam(Student student, int grade) {
        this.student = student;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
