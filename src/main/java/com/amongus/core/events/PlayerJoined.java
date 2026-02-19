package com.amongus.core.events;
import com.amongus.core.model.PlayerId;

public record PlayerJoined(PlayerId playerId) implements GameEvent {

}
