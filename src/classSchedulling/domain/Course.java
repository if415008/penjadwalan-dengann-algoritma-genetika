package classSchedulling.domain;

import java.util.ArrayList;

public class Course {

    private String number = null;
    private String name = null;
    private int maxNumbOfStudents;
    private ArrayList<Lecturer> lecturers;

    public Course(String number, String name, ArrayList<Lecturer> lecturers, int maxNumbOfStudents) {
        this.number = number;
        this.name = name;
        this.lecturers = lecturers;
        this.maxNumbOfStudents = maxNumbOfStudents;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumbOfStudents() {
        return maxNumbOfStudents;
    }

    public void setMaxNumbOfStudents(int maxNumbOfStudents) {
        this.maxNumbOfStudents = maxNumbOfStudents;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    @Override
    public String toString() {
        return name;
    }

}
