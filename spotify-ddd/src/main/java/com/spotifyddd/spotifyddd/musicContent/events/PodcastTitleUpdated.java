package com.spotifyddd.spotifyddd.musicContent.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeID;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeTitle;

public class PodcastTitleUpdated extends DomainEvent {
    public final PodcastEpisodeID podcastEpisodeID;
    public final PodcastEpisodeTitle podcastEpisodeTitle;


    public PodcastTitleUpdated(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle) {
        super("spotify.clientAccount.podcastTitleUpdated");
        this.podcastEpisodeID = podcastEpisodeID;
        this.podcastEpisodeTitle = podcastEpisodeTitle;
    }

    public PodcastEpisodeID getPodcastEpisodeID() {
        return podcastEpisodeID;
    }

    public PodcastEpisodeTitle getPodcastEpisodeTitle() {
        return podcastEpisodeTitle;
    }
}
