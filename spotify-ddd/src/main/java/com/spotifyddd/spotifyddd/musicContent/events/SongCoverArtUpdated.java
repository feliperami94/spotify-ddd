package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;
import com.spotifyddd.spotifyddd.musicContent.values.SongName;

public class SongCoverArtUpdated extends DomainEvent {
    public final SongID songID;
    public final CoverArt coverArt;


    public SongCoverArtUpdated(SongID songID, CoverArt coverArt) {
        super("spotify.clientAccount.songCoverArt");
        this.songID = songID;
        this.coverArt = coverArt;

    }

    public SongID getSongID() {
        return songID;
    }

    public CoverArt getSongCoverArt() {
        return coverArt;
    }

}
