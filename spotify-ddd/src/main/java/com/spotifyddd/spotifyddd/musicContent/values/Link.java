package com.spotifyddd.spotifyddd.musicContent.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class Link implements ValueObject<String> {
    final String value;

    public Link(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The content link can't be empty");
        }

        if(this.value.length() < 10 ){
            throw new IllegalArgumentException("The content link is too short");
        }
        if(this.value.length() > 100 ){
            throw new IllegalArgumentException("The content link is too long");
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
        Link that =  (Link) o;
        return Objects.equals(value, that.value);
    }
}
