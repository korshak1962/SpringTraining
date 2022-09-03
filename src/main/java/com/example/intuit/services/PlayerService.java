package com.example.intuit.services;

import com.example.intuit.dao.Item;
import com.example.intuit.dao.Player;

import java.util.Collection;

public interface PlayerService {
    public Player getPlayerById(String id);
    public void savePlayer(Player player);
    public void saveAllPlayers();
    public Collection<Player> getAllPlayerss();
    public boolean updatePlayerWeight(String id);

}
