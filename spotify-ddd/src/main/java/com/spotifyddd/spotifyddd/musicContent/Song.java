package com.spotifyddd.spotifyddd.musicContent;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.musicContent.values.*;

import java.util.Objects;

public class Song extends Entity<SongID> {
    private SongName songName;
    private CoverArt songCoverArt;

    public Song(SongID songID, SongName songName, CoverArt songCoverArt) {
        super(songID);
        this.songName = songName;
        this.songCoverArt = songCoverArt;
    }

    public void updateSongName(SongName songName) {
        this.songName = Objects.requireNonNull(songName);
    }

    public void updateSongCoverArt(CoverArt songCoverArt) {
        this.songCoverArt = Objects.requireNonNull(songCoverArt);
    }

    public SongName getSongName() {
        return songName;
    }

    public CoverArt getSongCoverArt() {
        return songCoverArt;
    }
}
