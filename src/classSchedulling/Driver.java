package classSchedulling;

import java.util.ArrayList;
import classSchedulling.domain.Class;

public class Driver {

    public static final int POPULATION_SIZE = 2;
    public static final double MUTATION_RATE = 2;
    public static final double CROSSOVER_RATE = 0.9;
    public static final int TOURNAMENT_SELECTION_SIZE = 3;
    public static final int NUMB_OF_ELITE_SCHEDULES = 1;
    private int scheduleNumb = 0;
    private int classNumb = 1;
    private Data data;

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.data = new Data();
        //driver.printAvailableData();
        int generationNumber = 0;
        System.out.println(">Generation #" + generationNumber);
        AlgoritmaGenetika geneticAlgorithm = new AlgoritmaGenetika(driver.data);
        //Population population = new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
        Population population = new Population(Driver.POPULATION_SIZE, driver.data);
        //population.getSchedule().forEach(schedule -> System.out.println("   " + driver.scheduleNumb++ + "  |" + schedule + "|" + String.format("%.5f", schedule.getFitness()) + "|" + schedule.getNumbOfConflicts()));
        driver.printScheduleAsTable(population.getSchedule().get(0), generationNumber);
        driver.classNumb = 1;
        while (population.getSchedule().get(0).getFitness()!= 1) {
            System.out.println("> Generation #" + ++generationNumber);
            //population = geneticAlgorithm.evolve(population).sortByFitness();
            population = geneticAlgorithm.evolve(population);
            driver.scheduleNumb = 0;
            //population.getSchedule().forEach(schedule -> System.out.println("   " + driver.scheduleNumb++ + " |" + schedule + " | " + String.format("%.5f", schedule.getFitness()) + " | " + schedule.getNumbOfConflicts()));
            driver.printScheduleAsTable(population.getSchedule().get(0), generationNumber);
            driver.classNumb = 1;

        }
    }

    private void printScheduleAsTable(Schedule schedule, int generation) {
        // TODO Auto-generated method stub
        ArrayList<Class> classes = schedule.getClasses();
        System.out.println("============================================================================================================================================================");
        System.out.printf("%10s %10s %40s %10s %50s %30s", "No", "Kelas", "COURSE", "ROOM", "INSTRUCTOR", "MEETING TIME");
        System.out.println();
        System.out.println("============================================================================================================================================================");
        classes.forEach(x -> {
            int majorIndex = data.getDepts().indexOf(x.getDept());
            int coursesIndex = data.getCourses().indexOf(x.getCourse());
            int roomsIndex = data.getRooms().indexOf(x.getRoom());
            int lecturesIndex = data.getLecturers().indexOf(x.getLecturer());
            int meetingTimeIndex = data.getMeetingtimes().indexOf(x.getMeetingtime());
            System.out.printf("%10s %10s %40s %10s %50s %30s", classNumb, data.getDepts().get(majorIndex).getName(), data.getCourses().get(coursesIndex).getName(), data.getRooms().get(roomsIndex).getNumber(), data.getLecturers().get(lecturesIndex).getName(), data.getMeetingtimes().get(meetingTimeIndex).getTime());
            System.out.println();
            classNumb++;
        });
        if (schedule.getFitness() == 1) {
            System.out.println("> solution found in " + (generation + 1) + " generations");
        }
        System.out.print("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

    }

    private void printAvailableData() {
        System.out.println("Available Departments =>");
        data.getDepts().forEach(x -> System.out.println("name: " + x.getName() + ", courses: " + x.getCourses()));
        System.out.println("\nAvailable Courses =>");
        data.getCourses().forEach(x -> System.out.println("Courses #: " + x.getNumber() + ", name: " + x.getName() + ", siswa maksimal: " + x.getMaxNumbOfStudents() + ", Dosen: " + x.getLecturers()));
        System.out.println("\nAvailable Rooms=>");
        data.getRooms().forEach(x -> System.out.println("room #: " + x.getNumber() + ", Kapasitas kursi: " + x.getJumlahKursi()));
        System.out.println("\nAvailable Dosen=>");
        data.getLecturers().forEach(x -> System.out.println("ID #: " + x.getId() + ", name: " + x.getName()));
        System.out.println("\nAvailable Waktu=>");
        data.getMeetingtimes().forEach(x -> System.out.println("ID #: " + x.getId() + ",Meeting time: " + x.getTime()));
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
    }

}
