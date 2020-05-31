package net.egv.goratings.repositories;

import net.egv.goratings.entities.Club;
import net.egv.goratings.entities.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
