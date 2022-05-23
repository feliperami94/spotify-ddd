package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class ArtistPasswordUpdated extends DomainEvent {
    public final ArtistAccountID artistAccountID;
    public final Password artistPassword;


    public ArtistPasswordUpdated(ArtistAccountID artistAccountID, Password artistPassword) {
        super("spotify.clientAccount.artistPasswordUpdated");

        this.artistAccountID = artistAccountID;
        this.artistPassword = artistPassword;
    }

    public ArtistAccountID getArtistAccountID() {
        return artistAccountID;
    }

    public Password getArtistPassword() {
        return artistPassword;
    }
}
