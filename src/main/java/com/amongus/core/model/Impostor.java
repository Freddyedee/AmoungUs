package com.amongus.core.model;

public class Impostor extends Player{

    public Impostor(String name, String color) {
        super(name, color);
    }

    @Override
    public String getRol() {
        return "Impostor";
    }

    public void kill(Player victim){
        if(victim==null)return;
        if(victim.isAlive())victim.setAlive(false);
    }
}
