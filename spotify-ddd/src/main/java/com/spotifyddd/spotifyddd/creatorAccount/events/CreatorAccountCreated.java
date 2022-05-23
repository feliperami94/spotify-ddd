package com.spotifyddd.spotifyddd.creatorAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;
import com.spotifyddd.spotifyddd.creatorAccount.values.Biography;

public class CreatorAccountCreated extends DomainEvent {
    public final Biography biography;

    public CreatorAccountCreated(Biography biography) {
        super("spotify.clientAccount.creatorAccountCreated");

        this.biography = biography;
    }

    public Biography getBiography() {
        return biography;
    }
}
