package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UpdateUserEmail extends Command {


    private final UserAccountID userAccountID;
    private final Email userEmail;

    public UpdateUserEmail(UserAccountID userAccountID, Email userEmail) {

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
