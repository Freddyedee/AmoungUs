package com.amongus.core.model;

public class Crewmate extends Player{

    public Crewmate(String name, String color) {
        super(name, color);
    }

    @Override
    public String getRol() {
        return "Tripulante";
    }

    public void toTask(){}
}
