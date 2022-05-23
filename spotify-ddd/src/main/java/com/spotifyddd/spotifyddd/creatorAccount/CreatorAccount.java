package com.spotifyddd.spotifyddd.creatorAccount;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.clientAccount.ClientAccountChange;
import com.spotifyddd.spotifyddd.clientAccount.UserInfo;
import com.spotifyddd.spotifyddd.creatorAccount.events.*;
import com.spotifyddd.spotifyddd.creatorAccount.values.*;
import com.spotifyddd.spotifyddd.generics.Country;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class CreatorAccount extends AggregateEvent<CreatorID> {
    protected Biography biography;
    protected Set<ArtistInfo> artistInfos;
    protected Set<ArtistAccount> artistAccounts;

    public CreatorAccount(CreatorID creatorID, Biography biography) {
        super(creatorID);
        appendChange(new CreatorAccountCreated(biography)).apply();
    }

    private CreatorAccount(CreatorID creatorID){
        super(creatorID);
        subscribe(new CreatorAccountChange(this));
    }

    public static CreatorAccount from(CreatorID creatorID, List<DomainEvent> events){
        var creatorAccount = new CreatorAccount(creatorID);
        events.forEach(creatorAccount::applyEvent);
        return creatorAccount;
    }

    public void updateBiography(Biography biography){
        Objects.requireNonNull(biography);
        appendChange(new BiographyUpdated(biography)).apply();
    }

    public void addArtistInfo(ArtistInfoID artistID, ArtistName artistName, Country artistCountry){
        Objects.requireNonNull(artistID);
        Objects.requireNonNull(artistName);
        Objects.requireNonNull(artistCountry);
        appendChange(new ArtistInfoAdded(artistID, artistName, artistCountry)).apply();
    }

    public void updateArtistName(ArtistInfoID artistInfoID, ArtistName artistName){
        Objects.requireNonNull(artistInfoID);
        Objects.requireNonNull(artistName);
        appendChange(new ArtistNameUpdated(artistInfoID, artistName)).apply();
    }

    public void updateArtistCountry(ArtistInfoID artistInfoID, Country artistCountry){
        Objects.requireNonNull(artistInfoID);
        Objects.requireNonNull(artistCountry);
        appendChange(new ArtistCountryUpdated(artistInfoID, artistCountry)).apply();
    }

    public void addArtistAccount(ArtistAccountID artistAccountID, Email artistEmail, Password artistPassword){
        Objects.requireNonNull(artistAccountID);
        Objects.requireNonNull(artistEmail);
        Objects.requireNonNull(artistPassword);
        appendChange(new ArtistAccountAdded(artistAccountID, artistEmail, artistPassword)).apply();
    }

    public void updateArtistEmail(ArtistAccountID artistAccountID, Email artistEmail){
        Objects.requireNonNull(artistAccountID);
        Objects.requireNonNull(artistEmail);
        appendChange(new ArtistEmailUpdated(artistAccountID, artistEmail)).apply();
    }

    public void updateArtistPassword(ArtistAccountID artistAccountID, Password artistPassword){
        Objects.requireNonNull(artistAccountID);
        Objects.requireNonNull(artistPassword);
        appendChange(new ArtistPasswordUpdated(artistAccountID, artistPassword)).apply();
    }

    protected Optional<ArtistInfo> getArtistInfoByID(ArtistInfoID artistInfoID){
        return artistInfos()
                .stream()
                .filter(artistInfo -> artistInfo.identity().equals(artistInfoID))
                .findFirst();
    }

    protected Optional<ArtistAccount> getArtistAccountByID(ArtistAccountID artistAccountID){
        return artistAccounts()
                .stream()
                .filter(artistAccount -> artistAccount.identity().equals(artistAccountID))
                .findFirst();
    }

    public Biography biography() {
        return biography;
    }

    public Set<ArtistInfo> artistInfos() {
        return artistInfos;
    }

    public Set<ArtistAccount> artistAccounts() {
        return artistAccounts;
    }
}
