package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

public class UserInfoAdded extends DomainEvent {
    public final UserInfoID userInfoID;
    public final UserName userName;
    public final Country userCountry;


    public UserInfoAdded(UserInfoID userInfoID, UserName userName, Country userCountry) {
        super("spotify.clientAccount.userInfoAdded");

        this.userInfoID = userInfoID;
        this.userName = userName;
        this.userCountry = userCountry;
    }

    public UserInfoID getUserInfoID() {
        return userInfoID;
    }

    public UserName getUserName() {
        return userName;
    }

    public Country getUserCountry() {
        return userCountry;
    }
}
