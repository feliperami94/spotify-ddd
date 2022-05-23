package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.Link;
import com.spotifyddd.spotifyddd.musicContent.values.MusicContentID;

public class UpdateLink extends Command {
    private final MusicContentID musicContentID;
    private final Link link;

    public UpdateLink(MusicContentID musicContentID, Link link) {
        this.musicContentID = musicContentID;
        this.link = link;
    }

    public MusicContentID getMusicContentID() {
        return musicContentID;
    }

    public Link getLink() {
        return link;
    }
}
