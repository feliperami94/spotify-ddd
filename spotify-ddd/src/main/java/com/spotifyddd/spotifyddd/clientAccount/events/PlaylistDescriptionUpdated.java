package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistDescription;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;

public class PlaylistDescriptionUpdated extends DomainEvent {
    private final PlaylistID playlistID;
    private final PlaylistDescription playlistDescription;

    public PlaylistDescriptionUpdated(PlaylistID playlistID, PlaylistDescription playlistDescription) {
        super("spotify.clientAccount.playlistDescriptionUpdated");
        this.playlistID = playlistID;
        this.playlistDescription = playlistDescription;
    }

    public PlaylistID getPlaylistID() {
        return playlistID;
    }

    public PlaylistDescription getPlaylistDescription() {
        return playlistDescription;
    }
}
