package com.amongus.core.model;
import java.util.UUID;

public record PlayerId(UUID value){
    public static PlayerId random(){
        return new PlayerId(UUID.randomUUID());
    }
}
