package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;
import com.spotifyddd.spotifyddd.musicContent.values.SongName;

public class UpdateSongCoverArt extends Command {
    private final SongID songID;
    private final CoverArt songCoverArt;

    public UpdateSongCoverArt(SongID songID, CoverArt songCoverArt) {
        this.songID = songID;
        this.songCoverArt = songCoverArt;
    }

    public SongID getSongID() {
        return songID;
    }


    public CoverArt getSongCoverArt() {
        return songCoverArt;
    }
}
