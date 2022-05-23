package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.*;

public class PodcastEpisodeAdded extends DomainEvent {
    public final PodcastEpisodeID podcastEpisodeID;
    public final PodcastEpisodeTitle podcastEpisodeTitle;
    public final CoverArt podcastCoverArt;


    public PodcastEpisodeAdded(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle, CoverArt podcastCoverArt) {
        super("spotify.clientAccount.podcastEpisodeAdded");
        this.podcastEpisodeID = podcastEpisodeID;
        this.podcastEpisodeTitle = podcastEpisodeTitle;
        this.podcastCoverArt = podcastCoverArt;
    }

    public PodcastEpisodeID getPodcastEpisodeID() {
        return podcastEpisodeID;
    }

    public PodcastEpisodeTitle getPodcastEpisodeTitle() {
        return podcastEpisodeTitle;
    }

    public CoverArt getPodcastCoverArt() {
        return podcastCoverArt;
    }
}
