package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Pattern;

public class Password implements ValueObject<String> {
    final String value;

    public Password(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The password can't be empty");
        }

        if(this.value.length() < 8){
            throw new IllegalArgumentException("The password must have 8 characters at least");
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
        Password that =  (Password) o;
        return Objects.equals(value, that.value);
    }
}
