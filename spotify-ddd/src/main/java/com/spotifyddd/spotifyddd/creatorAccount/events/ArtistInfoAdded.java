package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistInfoID;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

public class ArtistInfoAdded extends DomainEvent {
    public final ArtistInfoID artistInfoID;
    public final ArtistName artistName;
    public final Country artistCountry;


    public ArtistInfoAdded(ArtistInfoID artistInfoID,  ArtistName artistName, Country artistCountry) {
        super("spotify.clientAccount.artistInfoAdded");

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
