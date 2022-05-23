package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;
import com.spotifyddd.spotifyddd.musicContent.values.SongName;

public class SongNameUpdated extends DomainEvent {
    public final SongID songID;
    public final SongName songName;


    public SongNameUpdated(SongID songID, SongName songName) {
        super("spotify.clientAccount.songNameUpdated");
        this.songID = songID;
        this.songName = songName;
    }

    public SongID getSongID() {
        return songID;
    }

    public SongName getSongName() {
        return songName;
    }

}
