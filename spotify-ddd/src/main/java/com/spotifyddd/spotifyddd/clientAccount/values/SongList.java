package com.spotifyddd.spotifyddd.clientAccount.values;

import co.com.sofka.domain.generic.ValueObject;
import com.spotifyddd.spotifyddd.musicContent.values.SongID;

import java.util.List;

public class SongList implements ValueObject<List<SongID>> {
    public List<SongID> value() {
        return null;
    }
}
