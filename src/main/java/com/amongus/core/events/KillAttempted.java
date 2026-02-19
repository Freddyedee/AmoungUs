package com.amongus.core.events;
import com.amongus.core.model.PlayerId;

public record KillAttempted(PlayerId killer, PlayerId victim) implements GameEvent{


}
