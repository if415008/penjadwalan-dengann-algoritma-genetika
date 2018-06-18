package classSchedulling.domain;

public class Class {

    private int id;
    private Department dept;
    private Course course;
    private Lecturer lecturer;
    private MeetingTime meetingtime;
    private Room room;

    public Class(int id, Department dept, Course course) {
        this.id = id;
        this.dept = dept;
        this.course = course;

    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setMeetingtime(MeetingTime meetingtime) {
        this.meetingtime = meetingtime;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public Department getDept() {
        return dept;
    }

    public Course getCourse() {
        return course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public MeetingTime getMeetingtime() {
        return meetingtime;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "[ " + dept.getName() + "," + course.getNumber() + "," + room.getNumber() + "," + lecturer.getId() + "," + meetingtime.getId() + "]";
    }

}
