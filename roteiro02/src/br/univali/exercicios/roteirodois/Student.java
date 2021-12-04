package br.univali.exercicios.roteirodois;

import java.time.LocalDate;

public class Student {
    private int rollNumber;
    private LocalDate enrollmentDate;
    private LocalDate dropDate;

    public boolean isEnrolled(LocalDate enrollmentDate){
        System.out.println("create Validate is enrolla,em data. ");       //aqui valida
        return true;
    }

    public Student(int rollNumber, LocalDate enrollmentDate, LocalDate dropDate) {
        this.rollNumber = rollNumber;
        this.enrollmentDate = enrollmentDate;
        this.dropDate = dropDate;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getDropDate() {
        return dropDate;
    }

    public void setDropDate(LocalDate dropDate) {
        this.dropDate = dropDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", enrollmentDate=" + enrollmentDate +
                ", dropDate=" + dropDate +
                '}';
    }

}
