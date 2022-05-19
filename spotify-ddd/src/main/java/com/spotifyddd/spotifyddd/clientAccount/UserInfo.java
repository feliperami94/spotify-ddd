package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.UserInfoID;

public class UserInfo extends Entity<UserInfoID> {
    public UserInfo(UserInfoID entityId) {
        super(entityId);
    }
}
