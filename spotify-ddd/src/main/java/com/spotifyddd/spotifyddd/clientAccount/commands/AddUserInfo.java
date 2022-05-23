package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.Country;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

public class AddUserInfo extends Command {
    private final UserInfoID userInfoID;
    private final UserName userName;
    private final Country userCountry;

    public AddUserInfo(UserInfoID userInfoID, UserName userName, Country userCountry) {

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
