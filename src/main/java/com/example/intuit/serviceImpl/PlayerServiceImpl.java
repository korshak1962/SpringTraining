package com.example.intuit.serviceImpl;

import com.example.intuit.PlayerController;
import com.example.intuit.dao.*;
import com.example.intuit.services.PlayerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    Logger logger = LogManager.getLogger(PlayerServiceImpl.class);

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Player getPlayerById(String id) {
        final Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isEmpty()) return new Player();
        else return optionalPlayer.get();
    }

    @Override
    public void savePlayer(Player player) {
        playerRepository.save(player);
        System.out.println("Saved");
    }

    @Override
    public void saveAllPlayers() {
        List<Player> players = CSVReader.read("c:\\users\\korsh\\Downloads\\People.csv");

        playerRepository.saveAll(players);

    }

    @Override
    public Collection<Player> getAllPlayerss() {
        Collection<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

    @Override
    public boolean updatePlayerWeight(String id) {
        Player player = getPlayerById(id);
        final String weight1 = player.getWeight();
        if (weight1 != null && weight1.length() != 0) {
            int weight = Integer.valueOf(weight1);
            if (weight < 100 || weight > 500) {
                return false;
            }
            player.setWeight(String.valueOf(++weight));
            savePlayer(player);
            logger.atInfo().log("saved " + weight);
            return true;
        }
        return false;
    }

    public void updatePlayerAttr(String id, String nameAttr, String value) {
        Player player = getPlayerById(id);

        // player.getClass().getField(nameAttr).set(value);
    }

}
