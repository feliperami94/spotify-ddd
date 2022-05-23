package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.Email;
import com.spotifyddd.spotifyddd.clientAccount.values.Password;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;
import com.spotifyddd.spotifyddd.clientAccount.values.UserName;

import java.util.Objects;

public class UserAccount extends Entity<UserAccountID> {
    private Email userEmail;
    private Password userPassword;

    public UserAccount(UserAccountID userAccountID, Email userEmail, Password userPassword) {
        super(userAccountID);
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public void updateUserEmail(Email userEmail) {
        this.userEmail = Objects.requireNonNull(userEmail);
    }

    public void updateUserPassword(Password userPassword) {
        this.userPassword = Objects.requireNonNull(userPassword);
    }

    public Email getUserEmail() {
        return userEmail;
    }

    public Password getUserPassword() {
        return userPassword;
    }
}
