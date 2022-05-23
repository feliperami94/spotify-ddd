package com.spotifyddd.spotifyddd.clientAccount.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UserEmailUpdated extends DomainEvent {
    public final UserAccountID userAccountID;
    public final Email userEmail;


    public UserEmailUpdated(UserAccountID userAccountID, Email userEmail) {
        super("spotify.clientAccount.emailUpdated");
        this.userAccountID = userAccountID;
        this.userEmail = userEmail;
    }

    public UserAccountID getUserAccountID() {
        return userAccountID;
    }

    public Email getUserEmail() {
        return userEmail;
    }
}
