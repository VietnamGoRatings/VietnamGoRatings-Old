package net.egv.goratings.services;

import net.egv.goratings.entities.Player;
import net.egv.goratings.repositories.ClubRepository;
import net.egv.goratings.entities.Club;
import net.egv.goratings.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Arrays;

@Service
public class DataInitService {
    private final ClubRepository clubRepository;
    private final PlayerRepository playerRepository;
    public DataInitService(ClubRepository clubRepository, PlayerRepository playerRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
    }

    @PostConstruct
    @Transactional
    public void fillData() {
        Club  dango = new Club("dango", "Dango");
        Club[] clubs = {dango,
        new Club("hoalu", "Hoa Lư"),
        new Club("tuoitre", "Tuổi Trẻ"),
        new Club("anhsang", "Ánh Sáng")};
        clubRepository.saveAll(Arrays.asList(clubs));

        Player[] players = {new Player("TranQuangTue", dango), new Player("FooBar", dango)};
        playerRepository.saveAll(Arrays.asList(players));
    }
}
