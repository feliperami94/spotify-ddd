package com.spotifyddd.spotifyddd.creatorAccount.values;

import co.com.sofka.domain.generic.Identity;

public class CreatorID extends Identity {
    public CreatorID(){

    }

    private CreatorID(String id){
        super(id);
    }

    public static CreatorID of(String id){
        return new CreatorID(id);
    }
}
