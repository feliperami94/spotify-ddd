package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class ArtistEmailUpdated extends DomainEvent {
    public final ArtistAccountID artistAccountID;
    public final Email artistEmail;

    public ArtistEmailUpdated(ArtistAccountID artistAccountID,  Email artistEmail) {
        super("spotify.clientAccount.artistEmailUpdated");

        this.artistAccountID = artistAccountID;
        this.artistEmail = artistEmail;
    }

    public ArtistAccountID getArtistAccountID() {
        return artistAccountID;
    }

    public Email getArtistEmail() {
        return artistEmail;
    }


}
