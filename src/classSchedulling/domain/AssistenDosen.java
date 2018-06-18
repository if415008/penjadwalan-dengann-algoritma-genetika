package classSchedulling.domain;

public class AssistenDosen {

    private String id_asdos;
    private String name_asdos;

    public AssistenDosen(String id_asdos, String name) {

        this.id_asdos = id_asdos;
        this.name_asdos = name_asdos;
    }

    public String getId_Asdos() {
        return id_asdos;
    }

    public String getName_Asdos() {
        return name_asdos;
    }

    @Override
    public String toString() {
        return name_asdos;
    }

}
