package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;
import com.spotifyddd.spotifyddd.musicContent.values.SongName;

public class UpdateSongName extends Command {
    private final SongID songID;
    private final SongName songName;

    public UpdateSongName(SongID songID, SongName songName) {
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
