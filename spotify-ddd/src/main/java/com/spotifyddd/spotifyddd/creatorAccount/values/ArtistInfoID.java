package com.spotifyddd.spotifyddd.creatorAccount.values;

import co.com.sofka.domain.generic.Identity;

public class ArtistInfoID extends Identity {

    public ArtistInfoID(){

    }

    private ArtistInfoID(String id){
        super(id);
    }

    public static ArtistInfoID of(String id){
        return new ArtistInfoID(id);
    }
}
