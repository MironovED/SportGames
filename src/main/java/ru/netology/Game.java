package ru.netology;

import java.util.*;


public class Game {
    private HashMap<String, Player> players = new HashMap<>();


    public void register(Player player, String name) {
        players.put(name, player);
    }

    public Map.Entry<String, Player> findByName(String playerName) {
        for (Map.Entry<String, Player> player : players.entrySet()) {
            if (player.getKey().contains(playerName)) {
                return player;
            }
        }
        return null;
    }


    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1) == null || findByName(playerName2) == null) {
            throw new NotRegisteredException("One of the players is not registered");
        }

        Player player1 = players.get(playerName1);
        Player player2 = players.get(playerName2);
        int result = player1.getStrength() - player2.getStrength();

        if (result > 0) {
            return 1;
        }
        if (result < 0) {
            return 2;
        }
        return 0;
    }

}



