package com.spotifyddd.spotifyddd.creatorAccount.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class Biography implements ValueObject<String> {

    final String value;

    public Biography(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The artist biography can't be empty");
        }

        if(this.value.length() < 50 ){
            throw new IllegalArgumentException("The biography must have at least 50 characters long");
        }
        if(this.value.length() > 5000 ){
            throw new IllegalArgumentException("The artist biography is too long");
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
        Biography that =  (Biography) o;
        return Objects.equals(value, that.value);
    }
}
