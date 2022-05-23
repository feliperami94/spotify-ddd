package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class AddArtistAccount extends Command {
    private final ArtistAccountID artistAccountID;
    private final Email artistEmail;
    private final Password artistPassword;

    public AddArtistAccount(ArtistAccountID artistAccountID, Email artistEmail, Password artistPassword) {


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
