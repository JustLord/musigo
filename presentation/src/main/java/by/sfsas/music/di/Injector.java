package by.sfsas.music.di;

import android.app.Application;

public class Injector {
    private static final Injector injector = new Injector();

    private AppComponent appComponent;

    private Injector() {}

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void initializeAppComponent(Application application) {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }
}
