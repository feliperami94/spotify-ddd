package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistAccountID;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class UpdateArtistEmail extends Command {
    private final ArtistAccountID artistAccountID;
    private final Email artistEmail;

    public UpdateArtistEmail(ArtistAccountID artistAccountID, Email artistEmail) {


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
