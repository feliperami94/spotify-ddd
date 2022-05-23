package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeID;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeTitle;

public class UpdatePodcastTitle extends Command {
    private final PodcastEpisodeID podcastEpisodeID;
    private final PodcastEpisodeTitle podcastEpisodeTitle;

    public UpdatePodcastTitle(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle) {
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
