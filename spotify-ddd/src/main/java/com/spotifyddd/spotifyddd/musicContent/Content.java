package com.spotifyddd.spotifyddd.musicContent;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.spotifyddd.spotifyddd.musicContent.events.*;
import com.spotifyddd.spotifyddd.musicContent.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Content extends AggregateEvent<ContentID> {

    protected Link link;
    protected Set<Song> songs;
    protected Set<PodcastEpisode> podcastEpisodes;

    public Content(ContentID contentID, Link link) {
        super(contentID);
        appendChange(new ContentAdded(link)).apply();
    }

    private Content(ContentID contentID){
        super(contentID);
        subscribe(new ContentChange(this));
    }

    public static Content from(ContentID contentID, List<DomainEvent> events){
        var musicContent = new Content(contentID);
        events.forEach(musicContent::applyEvent);
        return musicContent;
    }

    public void updateLink(Link link){
        Objects.requireNonNull(link);
        appendChange(new LinkUpdated(link)).apply();
    }

    public void addSong(SongID songID, SongName songName, CoverArt coverArt){
        Objects.requireNonNull(songID);
        Objects.requireNonNull(songName);
        Objects.requireNonNull(coverArt);
        appendChange(new SongAdded(songID, songName, coverArt)).apply();
    }

    public void updateSongName(SongID songID, SongName songName){
        Objects.requireNonNull(songID);
        Objects.requireNonNull(songName);
        appendChange(new SongNameUpdated(songID, songName)).apply();
    }

    public void updateSongCoverArt(SongID songID, CoverArt coverArt){
        Objects.requireNonNull(songID);
        Objects.requireNonNull(coverArt);
        appendChange(new SongCoverArtUpdated(songID, coverArt)).apply();
    }

    public void addPodcastEpisode(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle, CoverArt coverArt){
        Objects.requireNonNull(podcastEpisodeID);
        Objects.requireNonNull(podcastEpisodeTitle);
        Objects.requireNonNull(coverArt);
        appendChange(new PodcastEpisodeAdded(podcastEpisodeID, podcastEpisodeTitle, coverArt)).apply();
    }

    public void updatePodcastTitle(PodcastEpisodeID podcastEpisodeID, PodcastEpisodeTitle podcastEpisodeTitle){
        Objects.requireNonNull(podcastEpisodeID);
        Objects.requireNonNull(podcastEpisodeTitle);
        appendChange(new PodcastTitleUpdated(podcastEpisodeID, podcastEpisodeTitle)).apply();
    }

    public void updatePodcastCoverArt(PodcastEpisodeID podcastEpisodeID, CoverArt coverArt){
        Objects.requireNonNull(podcastEpisodeID);
        Objects.requireNonNull(coverArt);
        appendChange(new PodcastCoverArtUpdated(podcastEpisodeID, coverArt)).apply();
    }


    protected Optional<Song> getSongById(SongID songID){
        return songs()
                .stream()
                .filter(song -> song.identity().equals(songID))
                .findFirst();
    }

    protected Optional<PodcastEpisode> getPodcastEpisodeByID(PodcastEpisodeID podcastEpisodeID){
        return podcastEpisodes()
                .stream()
                .filter(podcastEpisode -> podcastEpisode.identity().equals(podcastEpisodeID))
                .findFirst();
    }

    public Link link() {
        return link;
    }

    public Set<Song> songs() {
        return songs;
    }

    public Set<PodcastEpisode> podcastEpisodes() {
        return podcastEpisodes;
    }
}
