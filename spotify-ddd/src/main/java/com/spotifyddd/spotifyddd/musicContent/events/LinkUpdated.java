package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.Biography;
import com.spotifyddd.spotifyddd.musicContent.values.Link;

public class LinkUpdated extends DomainEvent {
    public final Link link;

    public LinkUpdated(Link link) {
        super("spotify.clientAccount.linkUpdated");

        this.link = link;
    }

    public Link getLink() {
        return link;
    }
}
