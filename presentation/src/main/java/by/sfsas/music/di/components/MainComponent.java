package by.sfsas.music.di.components;

import javax.inject.Singleton;

import by.sfsas.music.di.modules.MainModule;
import by.sfsas.music.features.main.MainActivity;
import dagger.Subcomponent;

@Singleton
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
