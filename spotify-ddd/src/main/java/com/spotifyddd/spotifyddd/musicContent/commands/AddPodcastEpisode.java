package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.*;

public class AddPodcastEpisode extends Command {
    private final PodcastEpisodeID podcastEpisodeID;
    private final PodcastEpisodeTitle podcastEpisodeTitle;
    private final CoverArt podcastCoverArt;

    public AddPodcastEpisode(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle, CoverArt podcastCoverArt) {
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
