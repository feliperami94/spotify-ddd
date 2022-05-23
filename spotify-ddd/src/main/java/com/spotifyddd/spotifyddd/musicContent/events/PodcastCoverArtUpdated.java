package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeID;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeTitle;

public class PodcastCoverArtUpdated extends DomainEvent {
    public final PodcastEpisodeID podcastEpisodeID;
    public final CoverArt podcastCoverArt;


    public PodcastCoverArtUpdated(PodcastEpisodeID podcastEpisodeID, CoverArt podcastCoverArt) {
        super("spotify.clientAccount.podcastCoverArtUpdated");
        this.podcastEpisodeID = podcastEpisodeID;
        this.podcastCoverArt = podcastCoverArt;
    }

    public PodcastEpisodeID getPodcastEpisodeID() {
        return podcastEpisodeID;
    }


    public CoverArt getPodcastCoverArt() {
        return podcastCoverArt;
    }
}
