package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;

public class MembershipUpdated extends DomainEvent {
    public final Membership membership;


    public MembershipUpdated(Membership membership) {
        super("spotify.clientAccount.clientAccountCreated");
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }
}
