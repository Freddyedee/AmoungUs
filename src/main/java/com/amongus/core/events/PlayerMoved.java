package com.amongus.core.events;
import com.amongus.core.model.PlayerId;
import com.amongus.core.model.Position;

public record PlayerMoved(PlayerId playerId, Position to) implements GameEvent {

}
