package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game = new Game();

    @Test
    void round1() {
        game.register(new Player(1, "Vladimir", 6));
        game.register(new Player(2, "Anton", 7));


        int actual = game.round("Vladimir", "Anton");

        assertEquals(1, actual);


    }

    @Test
    void round2() {
        game.register(new Player(1, "Vladimir", 7));
        game.register(new Player(2, "Anton", 7));


        int actual = game.round("Vladimir", "Anton");

        assertEquals(0, actual);

    }

    @Test
    void round3() {
        game.register(new Player(1, "Vladimir", 7));
        game.register(new Player(2, "Anton", 6));


        int actual = game.round("Vladimir", "Anton");

        assertEquals(2, actual);

    }
}