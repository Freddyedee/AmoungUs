package com.amongus.core.events;

import com.amongus.core.model.PlayerId;

public record BodyReported(PlayerId reporter, PlayerId victim) implements GameEvent {
}
