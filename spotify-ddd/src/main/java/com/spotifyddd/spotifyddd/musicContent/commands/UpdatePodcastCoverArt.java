package com.spotifyddd.spotifyddd.musicContent.commands;

import co.com.sofka.domain.generic.Command;
import com.spotifyddd.spotifyddd.musicContent.values.CoverArt;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeID;
import com.spotifyddd.spotifyddd.musicContent.values.PodcastEpisodeTitle;

public class UpdatePodcastCoverArt extends Command {
    private final PodcastEpisodeID podcastEpisodeID;
    private final CoverArt podcastCoverArt;

    public UpdatePodcastCoverArt(PodcastEpisodeID podcastEpisodeID, CoverArt podcastCoverArt) {
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
