package com.learnspring.learn_spring.game;

public class MarioGame implements GameConsole {
    public void up() {
        System.out.println("Mario Jump");
    }
    public void down() {
        System.out.println("Mario Duck");
    }
    public void left() {
        System.out.println("Mario Go Back");
    }
    public void right() {
        System.out.println("Mario Go Ahead");
    }
}