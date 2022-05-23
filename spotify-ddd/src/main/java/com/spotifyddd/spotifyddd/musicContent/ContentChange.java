package com.spotifyddd.spotifyddd.musicContent;

import co.com.sofka.domain.generic.EventChange;
import com.spotifyddd.spotifyddd.clientAccount.events.*;
import com.spotifyddd.spotifyddd.musicContent.events.*;

import java.util.HashSet;

public class ContentChange extends EventChange {

    public ContentChange(Content content) {
        apply((ContentAdded event) -> {
            content.link = event.getLink();
            content.songs = new HashSet<>();
            content.podcastEpisodes = new HashSet<>();
        });

        apply((LinkUpdated event) -> {
            content.link = event.getLink();
        });

        apply((SongAdded event) -> {
            content.songs.add(new Song(
                            event.getSongID(),
                            event.getSongName(),
                            event.getSongCoverArt()
                    )
            );
        });

        apply((SongNameUpdated event) -> {
            var song = content.getSongById(event.getSongID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the song"));
            song.updateSongName(event.getSongName());
        });

        apply((SongCoverArtUpdated event) -> {
            var song = content.getSongById(event.getSongID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the song"));
            song.updateSongCoverArt(event.getSongCoverArt());
        });

        apply((PodcastEpisodeAdded event) -> {
            content.podcastEpisodes.add(new PodcastEpisode(
                            event.getPodcastEpisodeID(),
                            event.getPodcastEpisodeTitle(),
                            event.getPodcastCoverArt()
                    )
            );
        });

        apply((PodcastTitleUpdated event) -> {
            var podcastEpisode = content.getPodcastEpisodeByID(event.getPodcastEpisodeID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the podcast episode"));
            podcastEpisode.updatePodcastEpisodeTitle(event.getPodcastEpisodeTitle());
        });

        apply((PodcastCoverArtUpdated event) -> {
            var podcastEpisode = content.getPodcastEpisodeByID(event.getPodcastEpisodeID())
                    .orElseThrow(() -> new IllegalArgumentException("Can't find the podcast"));
            podcastEpisode.updatePodcastEpisodeCoverArt(event.getPodcastCoverArt());
        });






    }
}
