package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.Country;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

import java.util.Objects;

public class UserInfo extends Entity<UserInfoID> {
    private UserName userName;
    private Country userCountry;

    public UserInfo(UserInfoID userInfoID, UserName userName, Country userCountry) {
        super(userInfoID);
        this.userName = userName;
        this.userCountry = userCountry;
    }

    public void updateUserName(UserName userName) {
        this.userName = Objects.requireNonNull(userName);
    }

    public void updateCountry(Country userCountry) {
        this.userCountry = Objects.requireNonNull(userCountry);
    }



    public UserName getUserName() {
        return userName;
    }

    public Country getUserCountry() {
        return userCountry;
    }
}
