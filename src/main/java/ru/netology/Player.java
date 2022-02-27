package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player implements Comparator <Player> {
    private int id;
    private String name;
    private int strength;

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getStrength() - o2.getStrength();
    }
}
