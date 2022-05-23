package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;

public class UserName implements ValueObject<String> {
    final String value;

    public UserName(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The user name can't be empty");
        }

        if(this.value.length() < 5){
            throw new IllegalArgumentException("The user name must have 5 or more characters");
        }

        if(this.value.contains(" ")){
            throw new IllegalArgumentException("The user name can't have spaces");
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
        UserName that =  (UserName) o;
        return Objects.equals(value, that.value);
    }
}
