package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class ArtistAccountAdded extends DomainEvent {
    public final ArtistAccountID artistAccountID;
    public final Email artistEmail;
    public final Password artistPassword;


    public ArtistAccountAdded(ArtistAccountID artistAccountID,  Email artistEmail, Password artistPassword) {
        super("spotify.clientAccount.artistAccountAdded");

        this.artistAccountID = artistAccountID;
        this.artistEmail = artistEmail;
        this.artistPassword = artistPassword;
    }

    public ArtistAccountID getArtistAccountID() {
        return artistAccountID;
    }

    public Email getArtistEmail() {
        return artistEmail;
    }

    public Password getArtistPassword() {
        return artistPassword;
    }
}
