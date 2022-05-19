package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;

public class PlaylistDeleted extends DomainEvent {
    private final PlaylistID playlistID;

    public PlaylistDeleted(PlaylistID playlistID) {
        super("spotify.clientAccount.playlistDeleted");
        this.playlistID = playlistID;
    }

    public PlaylistID getPlaylistID() {
        return playlistID;
    }


}
