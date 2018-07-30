package by.sfsas.music.features.launch;

import android.content.Intent;
import android.os.Bundle;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import javax.inject.Inject;
import javax.inject.Provider;

import by.sfsas.music.R;
import by.sfsas.music.di.Injector;
import by.sfsas.music.features.base.BaseActivity;

public class LaunchActivity extends BaseActivity implements LaunchView {

    @InjectPresenter
    LaunchPresenter presenter;

    @Inject
    Provider<LaunchPresenter> presenterProvider;

    @ProvidePresenter
    LaunchPresenter providePresenter() {
        return presenterProvider.get();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    protected void injectComponent() {
        Injector.getInstance().getAppComponent().inject(this);
    }

    @Override
    public void startNextActivity(Intent intent) {
        startActivity(intent);
        finish();
    }
}
