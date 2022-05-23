package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;
import com.spotifyddd.spotifyddd.clientAccount.values.UserID;

public class AddClientAccount extends Command {
    private final UserID userID;
    private final Membership membership;

    public AddClientAccount(UserID userID, Membership membership) {

        this.userID = userID;
        this.membership = membership;
    }

    public UserID getUserID() {
        return userID;
    }

    public Membership getMembership() {
        return membership;
    }
}
