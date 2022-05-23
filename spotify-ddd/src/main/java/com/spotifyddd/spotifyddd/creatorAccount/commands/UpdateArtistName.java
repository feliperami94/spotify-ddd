package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;

public class UpdateArtistName extends Command {
    private final ArtistInfoID artistInfoID;
    private final ArtistName artistName;

    public UpdateArtistName(ArtistInfoID artistInfoID, ArtistName artistName) {

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
