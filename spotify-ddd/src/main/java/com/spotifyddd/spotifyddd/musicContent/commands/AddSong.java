package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.*;

public class AddSong extends Command {
    private final SongID songID;
    private final SongName songName;
    private final CoverArt songCoverArt;

    public AddSong(SongID songID, SongName songName, CoverArt songCoverArt) {
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
