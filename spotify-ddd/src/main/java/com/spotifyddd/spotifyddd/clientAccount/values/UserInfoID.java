package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.Identity;

public class UserInfoID extends Identity {

    public UserInfoID(){

    }

    private UserInfoID(String id){
        super(id);
    }

    public static UserInfoID of(String id){
        return new UserInfoID(id);
    }
}
