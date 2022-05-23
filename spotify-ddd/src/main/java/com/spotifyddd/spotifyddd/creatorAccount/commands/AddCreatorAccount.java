package com.spotifyddd.spotifyddd.creatorAccount.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.clientAccount.values.Membership;
import com.spotifyddd.spotifyddd.clientAccount.values.UserID;
import com.spotifyddd.spotifyddd.creatorAccount.values.Biography;
import com.spotifyddd.spotifyddd.creatorAccount.values.CreatorID;

public class AddCreatorAccount extends Command {
    private final CreatorID creatorID;
    private final Biography biography;

    public AddCreatorAccount(CreatorID creatorID, Biography biography) {
        this.creatorID = creatorID;
        this.biography = biography;
    }

    public CreatorID getCreatorID() {
        return creatorID;
    }

    public Biography getBiography() {
        return biography;
    }
}
