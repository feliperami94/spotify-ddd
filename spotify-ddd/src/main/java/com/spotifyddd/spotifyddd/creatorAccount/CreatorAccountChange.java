package com.spotifyddd.spotifyddd.creatorAccount;

import co.com.sofka.domain.generic.EventChange;
import com.spotifyddd.spotifyddd.clientAccount.ClientAccount;
import com.spotifyddd.spotifyddd.clientAccount.UserAccount;
import com.spotifyddd.spotifyddd.clientAccount.UserInfo;
import com.spotifyddd.spotifyddd.clientAccount.events.*;
import com.spotifyddd.spotifyddd.creatorAccount.events.*;

import java.util.HashSet;

public class CreatorAccountChange extends EventChange {

    public CreatorAccountChange(CreatorAccount creatorAccount) {
        apply((CreatorAccountCreated event) -> {
            creatorAccount.biography = event.getBiography();
            creatorAccount.artistInfos = new HashSet<>();
            creatorAccount.artistAccounts = new HashSet<>();
        });

        apply((BiographyUpdated event) -> {
            creatorAccount.biography = event.getBiography();
        });

        apply((ArtistInfoAdded event) -> {
            creatorAccount.artistInfos.add(new ArtistInfo(
                            event.getArtistInfoID(),
                            event.getArtistName(),
                            event.getArtistCountry()
                    )
            );
        });

        apply((ArtistNameUpdated event) -> {
            var artistInfo = creatorAccount.getArtistInfoByID(event.getArtistInfoID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the ArtistInfo"));
            artistInfo.updateArtistName(event.getArtistName());
        });

        apply((ArtistCountryUpdated event) -> {
            var artistInfo = creatorAccount.getArtistInfoByID(event.getArtistInfoID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the ArtistInfo"));
            artistInfo.updateArtistCountry(event.getArtistCountry());
        });

        apply((ArtistAccountAdded event) -> {
            creatorAccount.artistAccounts.add(new ArtistAccount(
                            event.getArtistAccountID(),
                            event.getArtistEmail(),
                            event.getArtistPassword()
                    )
            );
        });

        apply((ArtistEmailUpdated event) -> {
            var artistAccount = creatorAccount.getArtistAccountByID(event.getArtistAccountID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the ArtistAccount"));
            artistAccount.updateArtistEmail(event.getArtistEmail());
        });

        apply((ArtistPasswordUpdated event) -> {
            var artistAccount = creatorAccount.getArtistAccountByID(event.getArtistAccountID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the ArtistAccount"));
            artistAccount.updateArtistPassword(event.getArtistPassword());
        });






    }
}
