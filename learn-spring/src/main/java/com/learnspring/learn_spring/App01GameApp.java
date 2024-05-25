package com.learnspring.learn_spring;

import com.learnspring.learn_spring.game.GameRunner;
import com.learnspring.learn_spring.game.MarioGame;
import com.learnspring.learn_spring.game.Pacman;

public class App01GameApp {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner1 = new GameRunner(marioGame);
        gameRunner1.run();
        System.out.println();
        var pacmanGame = new Pacman();
        var gameRunner2 = new GameRunner(pacmanGame);
        gameRunner2.run();
    }
}
