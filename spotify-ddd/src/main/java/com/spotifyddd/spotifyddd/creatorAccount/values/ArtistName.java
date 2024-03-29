package com.spotifyddd.spotifyddd.creatorAccount.values;

import co.com.sofka.domain.generic.ValueObject;
import com.spotifyddd.spotifyddd.generics.Email;

import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Pattern;

public class ArtistName implements ValueObject<String> {

    final String value;

    public ArtistName(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The artist name can't be empty");
        }

        if(this.value.length() < 3 ){
            throw new IllegalArgumentException("The artist name must be at least 3 characters long");
        }
        if(this.value.length() > 30 ){
            throw new IllegalArgumentException("The artist name is too long");
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
        ArtistName that =  (ArtistName) o;
        return Objects.equals(value, that.value);
    }
}
