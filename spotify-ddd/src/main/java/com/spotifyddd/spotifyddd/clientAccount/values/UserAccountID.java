package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.Identity;

public class UserAccountID extends Identity {
    public UserAccountID(){

    }

    private UserAccountID(String id){
        super(id);
    }

    public static UserAccountID of(String id){
        return new UserAccountID(id);
    }
}
