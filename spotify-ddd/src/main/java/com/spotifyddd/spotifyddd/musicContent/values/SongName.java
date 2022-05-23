package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class SongName implements ValueObject<String> {

    final String value;

    public SongName(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The song must have a name");
        }

        if(this.value.length() > 100 ){
            throw new IllegalArgumentException("The song name must have less than or equal to 100 characters");
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
        SongName that =  (SongName) o;
        return Objects.equals(value, that.value);
    }
}
