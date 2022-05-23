package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;

public class UpdateCountry extends Command {


    private final UserInfoID userInfoID;
    private final Country userCountry;

    public UpdateCountry(UserInfoID userInfoID, Country userCountry) {
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
