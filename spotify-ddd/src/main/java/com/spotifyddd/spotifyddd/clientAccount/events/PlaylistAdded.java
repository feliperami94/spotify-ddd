package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.*;

public class PlaylistAdded extends DomainEvent {
    private final PlaylistID playlistID;
    private final PlaylistTitle playlistTitle;
    private final PlaylistDescription playlistDescription;
    private final CoverArt coverArt;
    private final SongList songList;



    public PlaylistAdded(PlaylistID playlistID, PlaylistTitle playlistTitle, PlaylistDescription playlistDescription, CoverArt coverArt, SongList songList) {
        super("spotify.clientAccount.playlistAdded");
        this.playlistID = playlistID;
        this.playlistTitle = playlistTitle;
        this.playlistDescription = playlistDescription;
        this.coverArt = coverArt;
        this.songList = songList;
    }

    public PlaylistID getPlaylistID() {
        return playlistID;
    }

    public PlaylistTitle getPlaylistTitle() {
        return playlistTitle;
    }

    public PlaylistDescription getPlaylistDescription() {
        return playlistDescription;
    }

    public CoverArt getCoverArt() {
        return coverArt;
    }

    public SongList getSongList() {
        return songList;
    }

}
