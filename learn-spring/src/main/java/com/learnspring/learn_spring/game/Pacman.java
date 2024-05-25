package com.learnspring.learn_spring.game;

public class Pacman implements GameConsole {
    public void up() {
        System.out.println("Go Up");
    }
    public void down() {
        System.out.println("Go Down");
    }
    public void left() {
        System.out.println("Go Left");
    }
    public void right() {
        System.out.println("Go Right");
    }
}