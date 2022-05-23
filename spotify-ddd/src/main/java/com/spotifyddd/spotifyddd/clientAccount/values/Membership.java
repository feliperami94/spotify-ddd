package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.ValueObject;

import java.lang.reflect.Member;
import java.text.ParseException;
import java.util.Objects;

public class Membership implements ValueObject<String> {
    final String value;

    public Membership(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value != "Free" && this.value != "Premium"){
            throw new IllegalArgumentException("The membership has an invalid value");
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
        Membership that =  (Membership) o;
        return Objects.equals(value, that.value);
    }
}
