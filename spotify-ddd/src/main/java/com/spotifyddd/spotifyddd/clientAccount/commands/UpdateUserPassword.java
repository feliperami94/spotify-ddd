package com.spotifyddd.spotifyddd.clientAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.generics.Password;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class UpdateUserPassword extends Command {


    private final UserAccountID userAccountID;
    private final Password userPassword;

    public UpdateUserPassword(UserAccountID userAccountID, Password userPassword) {

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
