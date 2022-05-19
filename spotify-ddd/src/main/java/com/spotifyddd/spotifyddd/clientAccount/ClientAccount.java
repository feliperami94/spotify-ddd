package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.AggregateEvent;
import com.spotifyddd.spotifyddd.clientAccount.events.*;
import com.spotifyddd.spotifyddd.clientAccount.values.*;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;

import java.util.Objects;
import java.util.Optional;


public class ClientAccount extends AggregateEvent<UserID> {
    protected Membership membership;
    protected UserInfo userinfo;
    protected UserAccount userAccount;
    protected Playlist playlist;

    public ClientAccount(UserID entityId, Membership membership) {
        super(entityId);
        appendChange(new ClientAccountCreated(membership)).apply();
    }

    public void addPlaylist(PlaylistID playlistID, PlaylistTitle playlistTitle, PlaylistDescription playlistDescription, CoverArt coverArt, SongList songList){
        Objects.requireNonNull(playlistID);
        Objects.requireNonNull(playlistTitle);
        Objects.requireNonNull(playlistDescription);
        Objects.requireNonNull(coverArt);
        Objects.requireNonNull(songList);
        appendChange(new PlaylistAdded(playlistID, playlistTitle, playlistDescription, coverArt, songList)).apply();
    }

    public void deletePlaylist(PlaylistID playlistID){
        Objects.requireNonNull(playlistID);
        appendChange(new PlaylistDeleted(playlistID)).apply();
    }

    public void updatePlaylistTitle(PlaylistID playlistID, PlaylistTitle playlistTitle){
        Objects.requireNonNull(playlistID);
        Objects.requireNonNull(playlistTitle);
        appendChange(new PlaylistTitleUpdated(playlistID, playlistTitle)).apply();
    }

    public void updatePlaylistDescription(PlaylistID playlistID, PlaylistDescription playlistDescription){
        Objects.requireNonNull(playlistID);
        Objects.requireNonNull(playlistDescription);
        appendChange(new PlaylistDescriptionUpdated(playlistID, playlistDescription)).apply();
    }

    public void updateCoverArt(PlaylistID playlistID, CoverArt coverArt){
        Objects.requireNonNull(playlistID);
        Objects.requireNonNull(coverArt);
        appendChange(new CoverArtUpdated(playlistID, coverArt)).apply();
    }

    ///PENDIENTE addSong y DeleteSong
    public void addSongToSongList(PlaylistID playlistID, SongID songID){
        Objects.requireNonNull(playlistID);
        Objects.requireNonNull(songID);
        appendChange(new SongAddedToSongList(playlistID, songID)).apply();
    }


    public Membership membership() {
        return membership;
    }

    public UserInfo userinfo() {
        return userinfo;
    }

    public UserAccount userAccount() {
        return userAccount;
    }

    public Playlist playlist() {
        return playlist;
    }














}
