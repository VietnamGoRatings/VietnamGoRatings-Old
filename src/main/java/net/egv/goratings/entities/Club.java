package net.egv.goratings.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Club {
    @Id
    private String id;
    private String name;

    @OneToMany
    @JoinColumn(name = "club_id")
    private List<Player> players = new ArrayList();
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
