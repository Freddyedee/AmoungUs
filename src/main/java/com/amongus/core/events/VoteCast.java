package com.amongus.core.events;

import com.amongus.core.model.PlayerId;

public record VoteCast(PlayerId voter, PlayerId voted) implements GameEvent { //if voted is null -> abstention.
}
