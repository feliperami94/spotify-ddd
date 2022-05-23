package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.Link;
import com.spotifyddd.spotifyddd.musicContent.values.ContentID;

public class UpdateLink extends Command {
    private final ContentID contentID;
    private final Link link;

    public UpdateLink(ContentID contentID, Link link) {
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
