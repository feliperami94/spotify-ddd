package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;

public class AddArtistInfo extends Command {
    private final ArtistInfoID artistInfoID;
    private final ArtistName artistName;
    private final Country artistCountry;

    public AddArtistInfo(ArtistInfoID artistInfoID, ArtistName artistName, Country artistCountry) {

        this.artistInfoID = artistInfoID;
        this.artistName = artistName;
        this.artistCountry = artistCountry;
    }

    public ArtistInfoID getArtistInfoID() {
        return artistInfoID;
    }

    public ArtistName getArtistName() {
        return artistName;
    }

    public Country getArtistCountry() {
        return artistCountry;
    }
}
