package com.spotifyddd.spotifyddd.musicContent;

import co.com.sofka.domain.generic.Entity;
import com.spotifyddd.spotifyddd.clientAccount.values.UserAccountID;
import com.spotifyddd.spotifyddd.generics.Email;
import com.spotifyddd.spotifyddd.generics.Password;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeID;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeTitle;

import java.util.Objects;

public class PodcastEpisode extends Entity<PodcastEpisodeID> {
    private PodcastEpisodeTitle podcastEpisodeTitle;
    private CoverArt podcastCoverArt;

    public PodcastEpisode(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle, CoverArt podcastCoverArt) {
        super(podcastEpisodeID);
        this.podcastEpisodeTitle = podcastEpisodeTitle;
        this.podcastCoverArt = podcastCoverArt;
    }

    public void updatePodcastEpisodeTitle(PodcastEpisodeTitle podcastEpisodeTitle) {
        this.podcastEpisodeTitle = Objects.requireNonNull(podcastEpisodeTitle);
    }

    public void updatePodcastEpisodeCoverArt(CoverArt podcastCoverArt) {
        this.podcastCoverArt = Objects.requireNonNull(podcastCoverArt);
    }

    public PodcastEpisodeTitle getPodcastEpisodeTitle() {
        return podcastEpisodeTitle;
    }

    public CoverArt getPodcastCoverArt() {
        return podcastCoverArt;
    }
}
