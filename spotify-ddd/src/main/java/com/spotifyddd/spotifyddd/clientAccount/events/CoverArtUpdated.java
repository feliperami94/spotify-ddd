package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.CoverArt;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;

public class CoverArtUpdated extends DomainEvent {
    private final PlaylistID playlistID;
    private final CoverArt coverArt;

    public CoverArtUpdated(PlaylistID playlistID, CoverArt coverArt) {
        super("spotify.clientAccount.CoverArtUpdated");
        this.playlistID = playlistID;
        this.coverArt = coverArt;
    }

    public PlaylistID getPlaylistID() {
        return playlistID;
    }

    public CoverArt getCoverArt() {
        return coverArt;
    }

}
