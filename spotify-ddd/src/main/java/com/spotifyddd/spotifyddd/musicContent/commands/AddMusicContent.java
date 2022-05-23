package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.Link;
import com.spotifyddd.spotifyddd.musicContent.values.ContentID;

public class AddMusicContent extends Command {
    private final ContentID contentID;
    private final Link link;

    public AddMusicContent(ContentID contentID, Link link) {
        this.contentID = contentID;
        this.link = link;
    }

    public ContentID getMusicContentID() {
        return contentID;
    }

    public Link getLink() {
        return link;
    }
}
