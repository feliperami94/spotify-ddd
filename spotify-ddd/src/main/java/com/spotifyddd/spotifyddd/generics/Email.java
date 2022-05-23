package com.spotifyddd.spotifyddd.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Pattern;

public class Email implements ValueObject<String> {
    final String value;

    public Email(String value) throws ParseException {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The email can't be empty");
        }

        if(Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@\" \n" +
                "        + \"[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$").matcher(value).matches()){
            throw new IllegalArgumentException("The user email is not valid");
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
        Email that =  (Email) o;
        return Objects.equals(value, that.value);
    }
}
