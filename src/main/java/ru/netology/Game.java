package ru.netology;

import java.util.*;


public class Game {
    private List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }


    public Player findByName(String playerName) {
        for (Player player : players) {
            if (player.getName().contains(playerName)) {
                return player;
            }
        }
        return null;
    }


    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1) == null || findByName(playerName2) == null) {
            throw new NotRegisteredException("One of the players is not registered");
        }
        findSort((left, right) -> (int)(left.getStrength() - right.getStrength()));
             {
            }
        return 0;
        }



    public Player[] findSort(Comparator<Player> comparator) {
        var result = players;
        result.sort(comparator);
        return result.toArray(new Player[0]);
    }


}
