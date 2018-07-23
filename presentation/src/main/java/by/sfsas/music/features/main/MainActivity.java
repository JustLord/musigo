package by.sfsas.music.features.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import javax.inject.Inject;
import javax.inject.Provider;

import by.sfsas.music.R;
import by.sfsas.music.features.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    @InjectPresenter
    MainPresenter presenter;
    @Inject
    Provider<MainPresenter> presenterProvider;

    @ProvidePresenter
    MainPresenter providePresenter() {
        return presenterProvider.get();
    }

    public static Intent getActivityIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void injectComponent() {

    }
}
