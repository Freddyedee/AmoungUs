package com.amongus.core.model;

public abstract class Player{
    private final String name;
    private final String color;
    private Position position;
    private boolean isAlive;

    public Player(String name, String color){
        this.name=name;
        this.color=color;
        position=new Position(0,0);
        isAlive=true;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void move(int deltaX, int deltaY){
        this.position=new Position(this.position.x()+deltaX,this.position.y()+deltaY);
    }
    public abstract String getRol();

}
