package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.Link;

public class ContentAdded extends DomainEvent {
    public final Link link;

    public ContentAdded(Link link) {
        super("spotify.clientAccount.musicContentAdded");

        this.link = link;
    }

    public Link getLink() {
        return link;
    }
}
