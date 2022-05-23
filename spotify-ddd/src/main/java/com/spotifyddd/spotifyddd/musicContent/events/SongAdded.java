package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;
import com.spotifyddd.spotifyddd.musicContent.values.SongName;

public class SongAdded extends DomainEvent {
    public final SongID songID;
    public final SongName songName;
    public final CoverArt songCoverArt;


    public SongAdded(SongID songID, SongName songName, CoverArt songCoverArt) {
        super("spotify.clientAccount.songAdded");
        this.songID = songID;
        this.songName = songName;
        this.songCoverArt = songCoverArt;

    }

    public SongID getSongID() {
        return songID;
    }

    public SongName getSongName() {
        return songName;
    }

    public CoverArt getSongCoverArt() {
        return songCoverArt;
    }
}
