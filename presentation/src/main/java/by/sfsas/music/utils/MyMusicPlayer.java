package by.sfsas.music.utils;

import android.content.Context;

import javax.inject.Inject;

public class MyMusicPlayer {
    private final Context context;

    @Inject
    public MyMusicPlayer(Context context) {
        this.context = context;
    }
}
