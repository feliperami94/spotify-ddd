package com.spotifyddd.spotifyddd.creatorAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

import java.util.Objects;

public class ArtistAccount extends Entity<ArtistAccountID> {
    private Email artistEmail;
    private Password artistPassword;

    public ArtistAccount(ArtistAccountID artistAccountID, Email artistEmail, Password artistPassword) {
        super(artistAccountID);

        this.artistEmail = artistEmail;
        this.artistPassword = artistPassword;
    }

    public void updateArtistEmail(Email artistEmail){
        this.artistEmail = Objects.requireNonNull(artistEmail);
    }

    public void updateArtistPassword(Password artistPassword){
        this.artistPassword = Objects.requireNonNull(artistPassword);
    }

    public Email getArtistEmail() {
        return artistEmail;
    }

    public Password getArtistPassword() {
        return artistPassword;
    }
}
