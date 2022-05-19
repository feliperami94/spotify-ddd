package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;

public class ClientAccountCreated extends DomainEvent {
    public final Membership membership;

    public ClientAccountCreated(Membership membership) {
        super("spotify.clientAccount.clientAccountCreated");
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }



}
