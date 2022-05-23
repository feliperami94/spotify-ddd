package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.generics.Password;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UserPasswordUpdated extends DomainEvent {
    public final UserAccountID userAccountID;
    public final Password userPassword;

    public UserPasswordUpdated(UserAccountID userAccountID, Password userPassword) {
        super("spotify.clientAccount.passwordUpdated");
        this.userAccountID = userAccountID;
        this.userPassword = userPassword;
    }

    public UserAccountID getUserAccountID() {
        return userAccountID;
    }

    public Password getUserPassword() {
        return userPassword;
    }
}
