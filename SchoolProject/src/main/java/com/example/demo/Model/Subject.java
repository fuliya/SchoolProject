package com.example.demo.Model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
    public Subject() {
    }

    public Subject(int id, String math, String english, String meroSeroFero, String meroBatabaran, String meroNepali) {
        this.id = id;
        this.math = math;
        this.english = english;

        this.meroSeroFero = meroSeroFero;
        this.meroBatabaran = meroBatabaran;
        this.meroNepali = meroNepali;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

@ManyToOne
@JoinColumn(name= "student_id")
private Student student;

    private String math;
    private String english;
    private String meroSeroFero;
    private String meroBatabaran;
    private String meroNepali;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    private transient int studentID;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMeroSeroFero() {
        return meroSeroFero;
    }

    public void setMeroSeroFero(String meroSeroFero) {
        this.meroSeroFero = meroSeroFero;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getMeroBatabaran() {
        return meroBatabaran;
    }

    public void setMeroBatabaran(String meroBatabaran) {
        this.meroBatabaran = meroBatabaran;
    }

    public String getMeroNepali() {
        return meroNepali;
    }

    public void setMeroNepali(String meroNepali) {
        this.meroNepali = meroNepali;
    }

}
