package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.generics.Country;

public class ArtistCountryUpdated extends DomainEvent {
    private final ArtistInfoID artistInfoID;
    private final Country artistCountry;


    public ArtistCountryUpdated(ArtistInfoID artistInfoID, Country artistCountry) {
        super("spotify.clientAccount.artistCountryUpdated");


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
