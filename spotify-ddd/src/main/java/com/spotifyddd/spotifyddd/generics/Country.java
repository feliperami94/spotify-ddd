package com.spotifyddd.spotifyddd.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class Country implements ValueObject<String> {
    final String value;

    public Country(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The user country can't be empty");
        }

        if(this.value.length() < 4){
            throw new IllegalArgumentException("The user country must have 4 or more characters");
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
        Country that =  (Country) o;
        return Objects.equals(value, that.value);
    }
}
