package net.egv.goratings.entities;

import javax.persistence.*;

@Entity
public class Player {

    @ManyToOne
    @JoinColumn(name ="club_id")
    private Club club;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    public Player(String name, Club club) {
        this.club = club;
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
