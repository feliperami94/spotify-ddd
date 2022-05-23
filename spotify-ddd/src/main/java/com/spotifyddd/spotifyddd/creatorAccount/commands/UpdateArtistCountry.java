package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;

public class UpdateArtistCountry extends Command {
    private final ArtistInfoID artistInfoID;
    private final Country artistCountry;

    public UpdateArtistCountry(ArtistInfoID artistInfoID, ArtistName artistName, Country artistCountry) {

        this.artistInfoID = artistInfoID;
        this.artistCountry = artistCountry;
    }

    public ArtistInfoID getArtistInfoID() {
        return artistInfoID;
    }


    public Country getArtistCountry() {
        return artistCountry;
    }
}
