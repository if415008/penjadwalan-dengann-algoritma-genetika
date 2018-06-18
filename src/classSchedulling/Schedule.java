package classSchedulling;

import java.util.ArrayList;
import classSchedulling.domain.*;
import classSchedulling.domain.Class;

public class Schedule {

    private ArrayList<Class> classes;
    private Data data;

    public Data getData() {
        return data;
    }
    private boolean isFitnessChanged = true;
    private double fitness = -1;
    private int classNumb = 0;
    private int numbOfConflicts = 0;

    public Schedule(Data data) {
        this.data = data;
        classes = new ArrayList<Class>(data.getNumberOfClasses());
    }

    public Schedule initialize() {
        new ArrayList<Department>(data.getDepts()).forEach(dept -> {
            dept.getCourses().forEach(course -> {
                Class newClass = new Class(classNumb++, dept, course);
                newClass.setMeetingtime(data.getMeetingtimes().get((int) (data.getMeetingtimes().size() * Math.random())));
                newClass.setRoom(data.getRooms().get((int) (data.getRooms().size() * Math.random())));
                newClass.setLecturer(course.getLecturers().get((int) (course.getLecturers().size() * Math.random())));
                classes.add(newClass);
            });
        });
        return this;
    }

    public int getNumbOfConflicts() {
        return numbOfConflicts;
    }

    public ArrayList<Class> getClasses() {
        isFitnessChanged = true;
        return classes;
    }

    public double getFitness() {
        if (isFitnessChanged == true) {
            fitness = calculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }

    private double calculateFitness() {
        numbOfConflicts = 0;
        classes.forEach(x -> {
            if (x.getRoom().getJumlahKursi() < x.getCourse().getMaxNumbOfStudents()) {
                numbOfConflicts++;
            }
            classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> {
                if (x.getMeetingtime() == y.getMeetingtime() && x.getId() != y.getId()) {
                    if (x.getRoom() == y.getRoom()) {
                        numbOfConflicts++;
                    }
                    if (x.getLecturer() == y.getLecturer()) {
                        numbOfConflicts++;
                    }
                }
            });
        });
        return 1 / (double) (numbOfConflicts + 1);
    }

    public String toString() {
        String returnValue = new String();
        for (int x = 0; x < classes.size() - 1; x++) {
            returnValue += classes.get(x) + ",";
        }
        returnValue += classes.get(classes.size() - 1);
        return returnValue;
    }

}
