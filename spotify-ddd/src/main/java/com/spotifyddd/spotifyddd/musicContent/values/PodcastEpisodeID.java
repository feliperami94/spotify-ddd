package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.Identity;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;

public class PodcastEpisodeID extends Identity {
    public PodcastEpisodeID(){

    }

    private PodcastEpisodeID(String id){
        super(id);
    }

    public static PodcastEpisodeID of(String id){
        return new PodcastEpisodeID(id);
    }
}
