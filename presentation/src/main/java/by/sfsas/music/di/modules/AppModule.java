package by.sfsas.music.di.modules;

import android.content.Context;


import javax.inject.Singleton;

import by.sfsas.data.repository.Repository;
import by.sfsas.domain.repository.IRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.InnerAppModule.class)
public class AppModule {

    private final Context appContext;

    public AppModule(Context context) {
        appContext = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return appContext;
    }

    @Module
    public interface InnerAppModule {

        /*@Binds
        @Singleton
        ExecutionThread provideExecutionThread(JobExecutor jobExecutor);

        @Binds
        @Singleton
        PostExecutionThread providePostExecutionThread(UIThread uiThread);*/

        @Binds
        @Singleton
        IRepository provideIRepository(Repository repository);

        /*@Binds
        @Singleton
        IPreferencesStorage provideIPreferencesStorage(PreferencesStorage preferencesStorage);*/
    }
}
