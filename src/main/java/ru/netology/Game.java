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
        Player[] Player = players.toArray(new Player[0]);
        int player1 = getStrength(Player[0]);
        int player2 = getStrength(Player[1]);
        int result = player1 - player2;
        if (result < 0) {
            return 1;
        }
        if (result > 0) {
            return 2;
        }
        return result;
    }


    public int getStrength(Player o) {
        return o.getStrength();
    }

}



