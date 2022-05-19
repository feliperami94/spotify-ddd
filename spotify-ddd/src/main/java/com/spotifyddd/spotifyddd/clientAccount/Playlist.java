package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.CoverArt;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistDescription;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistID;
import com.spotifyddd.spotifyddd.clientAccount.values.PlaylistTitle;
import com.spotifyddd.spotifyddd.clientAccount.values.SongList;

import java.util.Objects;

public class Playlist extends Entity<PlaylistID> {
    private PlaylistTitle playlistTitle;
    private PlaylistDescription playlistDescription;
    private CoverArt coverArt;
    private SongList songList;


    public Playlist(PlaylistID playlistID, PlaylistTitle playlistTitle, PlaylistDescription playlistDescription, CoverArt coverArt, SongList songList) {
        super(playlistID);
        this.playlistTitle = playlistTitle;
        this.playlistDescription = playlistDescription;
        this.coverArt = coverArt;
        this.songList = songList;
    }

    public void updatePlaylistTitle(PlaylistTitle playlistTitle){
        this.playlistTitle = Objects.requireNonNull(playlistTitle);
    }

    public void updatePlaylistDescription(PlaylistDescription playlistDescription){
        this.playlistDescription = Objects.requireNonNull(playlistDescription);
    }

    public void updateCoverArt(CoverArt coverArt){
        this.coverArt = Objects.requireNonNull(coverArt);
    }

    public void updateSongList(SongList songList){
        this.songList = Objects.requireNonNull(songList);
    }




    public PlaylistTitle playlistTitle() {
        return playlistTitle;
    }

    public PlaylistDescription playlistDescription() {
        return playlistDescription;
    }

    public CoverArt coverArt() {
        return coverArt;
    }

    public SongList songList() {
        return songList;
    }




}
