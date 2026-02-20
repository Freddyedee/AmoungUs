package com.amongus.core.api.session;

import com.amongus.core.api.player.Player;
import com.amongus.core.api.state.GameState;

import java.util.UUID;
import java.util.Collection;


public interface GameSession {

   UUID gestId();

   GameState getState();

   Collection<Player> getPlaayers();

   /*LOBBY*/

    void addPlayer(Player player);
    void startGame();

    /*In-Game*/

    void reportBody();

    /*Meeting*/

    void castVote(UUID voterId, UUID targetId, boolean skip);
    void resolveVoting();

}
