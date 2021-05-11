package be.ehb.spring_boot_demo.model;

//POJO => Plain Old Java Object
public class Evenement {

    private int id;
    private String naam, soort;

    public Evenement() {
    }

    public Evenement(int id, String naam, String soort) {
        this.id = id;
        this.naam = naam;
        this.soort = soort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", soort='" + soort + '\'' +
                '}';
    }
}
