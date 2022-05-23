package com.spotifyddd.spotifyddd.creatorAccount.values;

import co.com.sofka.domain.generic.Identity;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class ArtistAccountID extends Identity {
    public ArtistAccountID(){

    }

    private ArtistAccountID(String id){
        super(id);
    }

    public static ArtistAccountID of(String id){
        return new ArtistAccountID(id);
    }

}
