package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.*;

public class AddUserAccount extends Command {
    private final UserAccountID userAccountID;
    private final Email userEmail;
    private final Password userPassword;

    public AddUserAccount(UserAccountID userAccountID, Email userEmail, Password userPassword) {

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
