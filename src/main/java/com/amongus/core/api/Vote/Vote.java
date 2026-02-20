package com.amongus.core.api.Vote;

import java.util.UUID;

public interface Vote {

    UUID getVoterId();

    UUID getTargetId();

    boolean skip();
}
