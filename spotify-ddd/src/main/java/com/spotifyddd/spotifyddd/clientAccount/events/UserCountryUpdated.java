package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;

public class UserCountryUpdated extends DomainEvent {
    private final UserInfoID userInfoID;
    private final Country userCountry;


    public UserCountryUpdated(UserInfoID userInfoID, Country userCountry) {
        super("spotify.clientAccount.userCountryUpdated");

        this.userInfoID = userInfoID;
        this.userCountry = userCountry;
    }


    public UserInfoID getUserInfoID() {
        return userInfoID;
    }

    public Country getUserCountry() {
        return userCountry;
    }
}
