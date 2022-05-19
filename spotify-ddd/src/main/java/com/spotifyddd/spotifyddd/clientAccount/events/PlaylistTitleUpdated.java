package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistTitle;

public class PlaylistTitleUpdated extends DomainEvent {
    private final PlaylistID playlistID;
    private final PlaylistTitle playlistTitle;

    public PlaylistTitleUpdated(PlaylistID playlistID, PlaylistTitle playlistTitle) {
        super("spotify.clientAccount.playlistTitleUpdated");
        this.playlistID = playlistID;
        this.playlistTitle = playlistTitle;
    }

    public PlaylistID getPlaylistID() {
        return playlistID;
    }

    public PlaylistTitle getPlaylistTitle() {
        return playlistTitle;
    }
}
