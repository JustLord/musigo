package by.sfsas.music.di.modules;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import by.sfsas.data.network.api.RestApi;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public interface RestModule {

    @Provides
    @Singleton
    static RestApi provideRestApi(Retrofit retrofit) {
        return retrofit.create(RestApi.class);
    }

    @Provides
    @Singleton
    static Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("http://mytasks.elatesof.w07.hoster.by/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    @Singleton
    @Provides
    static OkHttpClient provideOkHttpClient1() {
        return new OkHttpClient.Builder()
                .connectTimeout(25, TimeUnit.SECONDS)
                .readTimeout(25, TimeUnit.SECONDS)
                .build();
    }

    /*@Provides
    @Singleton
    static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor logging,
                                            ErrorHandlingInterceptor errorHandlingInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(errorHandlingInterceptor)
                .addInterceptor(logging)
                .build();
    }

    @Provides
    @Singleton
    static HttpLoggingInterceptor provideLogging() {
        return new HttpLoggingInterceptor().setLevel(BuildConfig.DEBUG ?
                HttpLoggingInterceptor.Level.BODY :
                HttpLoggingInterceptor.Level.NONE);
    }

    @Provides
    @Singleton
    static Gson provideGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }*/
}
