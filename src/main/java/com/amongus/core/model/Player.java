package com.amongus.core.model;

public abstract class Player{
    private final PlayerId id;
    private String name;
    private String color;
    private Position position;
    private boolean isAlive;

    public Player(String name, String color){
        this.id=PlayerId.random();
        this.name=name;
        this.color=color;
        position=new Position(0,0);//Lobby
        isAlive=true;//Jugador vivo
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void move(int deltaX, int deltaY){
        //El jugador se esta moviendo
        this.position=new Position(this.position.x()+deltaX,this.position.y()+deltaY);
    }

    public abstract String getRol();

}
