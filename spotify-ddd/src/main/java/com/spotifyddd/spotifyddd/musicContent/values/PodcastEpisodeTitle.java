package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class PodcastEpisodeTitle implements ValueObject<String> {

    final String value;

    public PodcastEpisodeTitle(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The podcast must have a name");
        }

        if(this.value.length() < 5 ){
            throw new IllegalArgumentException("The podcast name must be at least 5 characters long");
        }
        if(this.value.length() > 100 ){
            throw new IllegalArgumentException("The podcast name can't be longer than 100 characters");
        }

    }

    public String value(){
        return value;
    }


    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastEpisodeTitle that =  (PodcastEpisodeTitle) o;
        return Objects.equals(value, that.value);
    }
}
