package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.EventChange;
import com.spotifyddd.spotifyddd.clientAccount.events.*;

import java.util.HashSet;

public class ClientAccountChange extends EventChange {
    public ClientAccountChange(ClientAccount clientAccount) {
        apply((ClientAccountCreated event) -> {
            clientAccount.membership = event.getMembership();
            clientAccount.userInfos = new HashSet<>();
            clientAccount.userAccounts = new HashSet<>();
        });

        apply((MembershipUpdated event) -> {
            clientAccount.membership = event.getMembership();
        });

        apply((UserInfoAdded event) -> {
            clientAccount.userInfos.add(new UserInfo(
                            event.getUserInfoID(),
                            event.getUserName(),
                            event.getUserCountry()
                    )
            );
        });

        apply((UserNameUpdated event) -> {
            var userInfo = clientAccount.getUserInfoByID(event.getUserInfoID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the UserInfo"));
            userInfo.updateUserName(event.getUserName());
        });

        apply((UserCountryUpdated event) -> {
            var userInfo = clientAccount.getUserInfoByID(event.getUserInfoID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the UserInfo"));
            userInfo.updateCountry(event.getUserCountry());
        });

        apply((UserAccountAdded event) -> {
            clientAccount.userAccounts.add(new UserAccount(
                            event.getUserAccountID(),
                            event.getUserEmail(),
                            event.getUserPassword()
                    )
            );
        });

        apply((UserEmailUpdated event) -> {
            var userAccounts = clientAccount.getUserAccountByID(event.getUserAccountID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the UserAccount"));
            userAccounts.updateUserEmail(event.getUserEmail());
        });

        apply((UserPasswordUpdated event) -> {
            var userAccounts = clientAccount.getUserAccountByID(event.getUserAccountID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the UserAccount"));
            userAccounts.updateUserPassword(event.getUserPassword());
        });






    }
}
