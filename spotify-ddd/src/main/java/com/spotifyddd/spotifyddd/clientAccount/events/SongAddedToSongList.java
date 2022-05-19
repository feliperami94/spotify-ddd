package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;

public class SongAddedToSongList extends DomainEvent {
    private final PlaylistID playlistID;
    private final SongID songID;

    public SongAddedToSongList(PlaylistID playlistID, SongID songID) {
        super("spotify.clienAccount.SongAddedToSongList");
        this.playlistID = playlistID;

    }
}
