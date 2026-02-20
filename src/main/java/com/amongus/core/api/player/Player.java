package com.amongus.core.api.player;

import java.util.UUID;

public interface Player {

    UUID getId();
    String getName();
    Role getRole();
    boolean alive();
    boolean connected();
}
