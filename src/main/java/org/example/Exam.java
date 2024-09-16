package org.example;

import jakarta.persistence.*;
import java.util.Date;

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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "grade_saving_date", nullable = false)
    private Date gradeSavingDate = new Date();


    public Exam() {}

    public Exam(Student student, int grade) {
        this.student = student;
        this.grade = grade;
        this.created_at = new Date();
        this.gradeSavingDate = new Date();
    }

    public int getGrade() {
        return grade;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public Date getGradeSavingDate() {
        return gradeSavingDate;
    }
}
