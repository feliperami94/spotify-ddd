package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UserAccount extends Entity<UserAccountID> {
    public UserAccount(UserAccountID entityId) {
        super(entityId);
    }
}
