package com.amongus.core.api;

import com.amongus.core.events.GameEvent;
import com.amongus.core.model.GameState;
import com.amongus.core.view.GameSnapshot;

public interface GameSession {

    /**
     * Punto único de entrada de eventos al core.
     */
    void handle(GameEvent event);

    /**
     * Estado actual del juego.
     */
    GameState getCurrentState();

    /**
     * Snapshot inmutable del estado del juego.
     */
    GameSnapshot snapshot();



}
