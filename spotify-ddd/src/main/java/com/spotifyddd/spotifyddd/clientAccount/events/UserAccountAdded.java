package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UserAccountAdded extends DomainEvent {
    public final UserAccountID userAccountID;
    public final Email userEmail;
    public final Password userPassword;

    public UserAccountAdded(UserAccountID userAccountID, Email userEmail, Password userPassword) {
        super("spotify.clientAccount.userAccountAdded");

        this.userAccountID = userAccountID;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public UserAccountID getUserAccountID() {
        return userAccountID;
    }

    public Email getUserEmail() {
        return userEmail;
    }

    public Password getUserPassword() {
        return userPassword;
    }
}
