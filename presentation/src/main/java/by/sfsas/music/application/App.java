package by.sfsas.music.application;

import android.app.Application;

import by.sfsas.music.di.Injector;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Injector.getInstance().initializeAppComponent(this);
    }
}
