package net.egv.goratings.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Club {
    @Id
    private String id;
    private String name;

    public Club(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Club() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
