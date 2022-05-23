package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.creatorAccount.values.Biography;
import com.spotifyddd.spotifyddd.musicContent.values.Link;

public class MusicContentAdded extends DomainEvent {
    public final Link link;

    public MusicContentAdded(Link link) {
        super("spotify.clientAccount.musicContentAdded");

        this.link = link;
    }

    public Link getLink() {
        return link;
    }
}
