package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class UpdateArtistPassword extends Command {
    private final ArtistAccountID artistAccountID;
    private final Password artistPassword;

    public UpdateArtistPassword(ArtistAccountID artistAccountID, Password artistPassword) {


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
