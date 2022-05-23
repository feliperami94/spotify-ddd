package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;

public class ArtistNameUpdated extends DomainEvent {
    private final ArtistInfoID artistInfoID;
    private final ArtistName artistName;


    public ArtistNameUpdated(ArtistInfoID artistInfoID, ArtistName artistName) {
        super("spotify.clientAccount.artistNameUpdated");


        this.artistInfoID = artistInfoID;
        this.artistName = artistName;
    }


    public ArtistInfoID getArtistInfoID() {
        return artistInfoID;
    }

    public ArtistName getArtistName() {
        return artistName;
    }
}
