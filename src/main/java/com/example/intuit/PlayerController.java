package com.example.intuit;

import com.example.intuit.dao.Item;
import com.example.intuit.dao.Player;
import com.example.intuit.services.ItemService;
import com.example.intuit.services.PlayerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PlayerController {
    Logger logger = LogManager.getLogger(PlayerController.class);

    @Autowired
    PlayerService playerService;

    @RequestMapping("/saveAllPlayers")
    public void saveAllPlayers(){
        playerService.saveAllPlayers();
    };

    @RequestMapping("/playerById/{id}")
    public Player getItemById(@PathVariable String id) {
        return playerService.getPlayerById(id);
    }
    @RequestMapping("/getAllPlayers")
    public Collection<Player> getAllPlayers(){
        return playerService.getAllPlayerss();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updatePlayerWeight/{id}")
    public boolean updatePlayerWeight( @PathVariable String id) {
        final boolean b = playerService.updatePlayerWeight(id);
        logger.info(" update player weight =" + b);
        return b;
    }

}
