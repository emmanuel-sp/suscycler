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

    public Bin() {

    }

    public Bin(Long id, String link) {
        this.id = id;
        this.link = link;
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
}
