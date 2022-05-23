package com.spotifyddd.spotifyddd.creatorAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;

import java.util.Objects;

public class ArtistInfo extends Entity<ArtistInfoID> {
    private ArtistName artistName;
    private Country artistCountry;

    public ArtistInfo(ArtistInfoID artistInfoID, ArtistName artistName, Country artistCountry) {
        super(artistInfoID);

        this.artistName = artistName;
        this.artistCountry = artistCountry;
    }

    public void updateArtistName(ArtistName artistName){
        this.artistName = Objects.requireNonNull(artistName);
    }

    public void updateArtistCountry(Country artistCountry){
        this.artistCountry = Objects.requireNonNull(artistCountry);
    }

    public ArtistName getArtistName() {
        return artistName;
    }

    public Country getArtistCountry() {
        return artistCountry;
    }
}
