package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

public class UserNameUpdated extends DomainEvent {
    private final UserInfoID userInfoID;
    private final UserName userName;


    public UserNameUpdated(UserInfoID userInfoID, UserName userName) {
        super("spotify.clientAccount.userNameUpdated");

        this.userInfoID = userInfoID;
        this.userName = userName;
    }


    public UserInfoID getUserInfoID() {
        return userInfoID;
    }

    public UserName getUserName() {
        return userName;
    }
}
