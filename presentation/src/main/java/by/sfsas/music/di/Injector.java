package by.sfsas.music.di;

import android.app.Application;

import by.sfsas.music.di.components.AppComponent;
import by.sfsas.music.di.components.DaggerAppComponent;
import by.sfsas.music.di.components.MainComponent;
import by.sfsas.music.di.modules.AppModule;

public class Injector {
    private static final Injector injector = new Injector();

    private AppComponent appComponent;
    private MainComponent mainComponent;

    private Injector() {}

    public static Injector getInstance() {
        return injector;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void initializeAppComponent(Application application) {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }

    public MainComponent plusMainComponent() {
        if (mainComponent == null) {
            mainComponent = appComponent.plusMainComponent();
        }
        return mainComponent;
    }

    public void clearMainComponent() {
        mainComponent = null;
    }
}
