package by.sfsas.music.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import by.sfsas.music.utils.MyMusicPlayer;
import dagger.Module;
import dagger.Provides;

@Module
public class PlayerModule {

    @Provides
    @Singleton
    MyMusicPlayer provideMyMusicPlayer(Context context){
        return new MyMusicPlayer(context);
    }
}
