package net.egv.goratings.controller;

import net.egv.goratings.entities.Club;
import net.egv.goratings.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClubController {

    ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping("/clubs")
    public String greeting( Model model) {
        Iterable<Club> cs = clubRepository.findAll();
        model.addAttribute("clubs", cs);
        return "clubs";
    }

}
