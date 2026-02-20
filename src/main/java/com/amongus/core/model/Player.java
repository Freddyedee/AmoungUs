package com.amongus.core.model;

public class Player {
    private PlayerId id;
    private String name;
    private String color;
    private boolean isAlive;
    private Position position;

    public Player(String name, String color){
        this.name=name;
        this.color=color;
        isAlive=true;
        id=PlayerId.random();
    }

    public String getName() {
        return name;
    }

    public PlayerId getId() {
        return id;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void move(int deltaX, int deltaY){


    }


}
