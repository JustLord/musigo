package by.sfsas.music.di.components;


import by.sfsas.music.di.annotations.PerActivity;
import by.sfsas.music.di.modules.MainModule;
import by.sfsas.music.features.main.MainActivity;
import dagger.Subcomponent;

@PerActivity(MainActivity.class)
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
