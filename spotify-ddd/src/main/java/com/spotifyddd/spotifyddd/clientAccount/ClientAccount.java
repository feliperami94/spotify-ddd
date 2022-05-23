package com.spotifyddd.spotifyddd.clientAccount;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.events.*;
import com.spotifyddd.spotifyddd.clientAccount.values.*;
import com.spotifyddd.spotifyddd.generics.Password;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class ClientAccount extends AggregateEvent<UserID> {
    protected Membership membership;
    protected Set<UserInfo> userInfos;
    protected Set<UserAccount> userAccounts;

    public ClientAccount(UserID userID, Membership membership) {
        super(userID);
        appendChange(new ClientAccountCreated(membership)).apply();
    }

    private ClientAccount(UserID userID){
        super(userID);
        subscribe(new ClientAccountChange(this));
    }

    public static ClientAccount from(UserID userID, List<DomainEvent> events){
        var clientAccount = new ClientAccount(userID);
        events.forEach(clientAccount::applyEvent);
        return clientAccount;
    }

    public void updateMembership(Membership membership){
        Objects.requireNonNull(membership);
        appendChange(new MembershipUpdated(membership)).apply();
    }

    public void addUserInfo(UserInfoID userInfoID, UserName userName, Country country){
        Objects.requireNonNull(userInfoID);
        Objects.requireNonNull(userName);
        Objects.requireNonNull(country);
        appendChange(new UserInfoAdded(userInfoID, userName, country)).apply();
    }
    public void updateUserName(UserInfoID userInfoID, UserName userName){
        Objects.requireNonNull(userInfoID);
        Objects.requireNonNull(userName);
        appendChange(new UserNameUpdated(userInfoID, userName)).apply();
    }

    public void updateUserCountry(UserInfoID userInfoID, Country country){
        Objects.requireNonNull(userInfoID);
        Objects.requireNonNull(country);
        appendChange(new UserCountryUpdated(userInfoID, country)).apply();
    }

    public void addUserAccount(UserAccountID userAccountID, Email email, Password password){
        Objects.requireNonNull(userAccountID);
        Objects.requireNonNull(email);
        Objects.requireNonNull(password);
        appendChange(new UserAccountAdded(userAccountID, email, password)).apply();
    }

    public void updateUserEmail(UserAccountID userAccountID, Email email){
        Objects.requireNonNull(userAccountID);
        Objects.requireNonNull(email);
        appendChange(new UserEmailUpdated(userAccountID, email)).apply();
    }

    public void updateUserPassword(UserAccountID userAccountID, Password password){
        Objects.requireNonNull(userAccountID);
        Objects.requireNonNull(password);
        appendChange(new UserPasswordUpdated(userAccountID, password)).apply();
    }

    protected Optional<UserInfo> getUserInfoByID(UserInfoID userInfoID){
        return userInfos()
                .stream()
                .filter(userInfo -> userInfo.identity().equals(userInfoID))
                .findFirst();
    }

    protected Optional<UserAccount> getUserAccountByID(UserAccountID userAccountID){
        return userAccounts()
                .stream()
                .filter(userAccount -> userAccount.identity().equals(userAccountID))
                .findFirst();
    }

    public Membership membership() {
        return membership;
    }

    public Set<UserInfo> userInfos() {
        return userInfos;
    }

    public Set<UserAccount> userAccounts() {
        return userAccounts;
    }
}
