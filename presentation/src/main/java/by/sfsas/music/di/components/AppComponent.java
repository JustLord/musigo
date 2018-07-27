package by.sfsas.music.di.components;

import javax.inject.Singleton;

import by.sfsas.music.di.modules.AppModule;
import by.sfsas.music.di.modules.PlayerModule;
import by.sfsas.music.di.modules.RestModule;
import by.sfsas.music.features.launch.LaunchActivity;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RestModule.class, PlayerModule.class})
public interface AppComponent {

    void inject(LaunchActivity activity);
    MainComponent plusMainComponent();
}

