package hacks.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bins")
public class Bin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String link;

    private int counter;

    private String campus;

    private String building;

    public Bin() {

    }

    public Bin(Long id, String link, int counter, String building, String campus) {
        this.id = id;
        this.link = link;
        this.counter = counter;
        this.building = building;
        this.campus = campus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getCampus() {
        return this.campus;
    }

    public String getBuilding() {
        return this.building;
    }
}
