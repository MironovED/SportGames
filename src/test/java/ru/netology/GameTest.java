package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game = new Game();

    @Test
    void round() {
        game.register(new Player(1, "Vladimir", 5));
        game.register(new Player(2, "Anton", 7));

//        game.findByName("Vladimir");
        game.round("Vladimir", "Anton");

//        assertEquals(1, game.round("Vladimir", "Vasya"));



    }
}