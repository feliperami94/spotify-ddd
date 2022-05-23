package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;
import com.spotifyddd.spotifyddd.clientAccount.values.UserID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

public class UpdateUserName extends Command {

    private final UserInfoID userInfoID;
    private final UserName userName;

    public UpdateUserName(UserInfoID userInfoID, UserName userName) {

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
