package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.Identity;

public class ContentID extends Identity {
    public ContentID(){

    }

    private ContentID(String id){
        super(id);
    }

    public static ContentID of(String id){
        return new ContentID(id);
    }
}
