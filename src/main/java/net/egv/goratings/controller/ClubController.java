package net.egv.goratings.controller;

import net.egv.goratings.entities.Club;
import net.egv.goratings.repositories.ClubRepository;
import net.egv.goratings.services.ClubDataInitService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class ClubController {
    @Autowired
    ClubRepository clubRepository;
    @GetMapping("/clubs")
    public String greeting( Model model) {
        Iterable<Club> cs = clubRepository.findAll();
        model.addAttribute("clubs", cs);
        return "clubs";
    }

}
