package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.ValueObject;
import com.spotifyddd.spotifyddd.creatorAccount.values.ArtistName;

import java.text.ParseException;
import java.util.Objects;

public class CoverArt implements ValueObject<String> { //This attribute would be a link to an image

    final String value;

    public CoverArt(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The cover art link can't be empty");
        }

        if(this.value.length() < 10 ){
            throw new IllegalArgumentException("The cover art link is too short");
        }
        if(this.value.length() > 100 ){
            throw new IllegalArgumentException("The cover art link is too long");
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
        CoverArt that =  (CoverArt) o;
        return Objects.equals(value, that.value);
    }
}
