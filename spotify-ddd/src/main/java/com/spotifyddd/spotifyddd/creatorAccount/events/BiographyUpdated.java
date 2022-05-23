package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.Biography;

public class BiographyUpdated extends DomainEvent {
    public final Biography biography;

    public BiographyUpdated(Biography biography) {
        super("spotify.clientAccount.biographyUpdated");

        this.biography = biography;
    }

    public Biography getBiography() {
        return biography;
    }
}
