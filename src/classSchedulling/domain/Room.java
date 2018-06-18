package classSchedulling.domain;

public class Room {

    private String number;
    private int jumlahKursi;

    public Room(String number, int jumlahKursi) {

        this.number = number;
        this.jumlahKursi = jumlahKursi;
    }

    public String getNumber() {
        return number;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

}
