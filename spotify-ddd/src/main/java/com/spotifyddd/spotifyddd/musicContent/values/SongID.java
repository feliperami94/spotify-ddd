package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.Identity;

public class SongID extends Identity {

    public SongID(){

    }

    private SongID(String id){
        super(id);
    }

    public static SongID of(String id){
        return new SongID(id);
    }
}
