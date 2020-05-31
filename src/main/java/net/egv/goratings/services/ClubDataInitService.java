package net.egv.goratings.services;

import net.egv.goratings.repositories.ClubRepository;
import net.egv.goratings.entities.Club;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class ClubDataInitService {
    private final ClubRepository clubRepository;
    public ClubDataInitService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @PostConstruct
    @Transactional
    public void fillData() {
        Club[] clubs = {new Club("dango", "Dango"),
        new Club("hoalu", "Hoa Lư"),
        new Club("tuoitre", "Tuổi Trẻ"),
        new Club("anhsang", "Ánh Sáng")};
        clubRepository.saveAll(Arrays.asList(clubs));

    }
}
