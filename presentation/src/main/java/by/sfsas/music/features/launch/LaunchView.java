package by.sfsas.music.features.launch;

import android.content.Intent;

import by.sfsas.music.features.base.BaseView;

public interface LaunchView extends BaseView {
    void startNextActivity(Intent intent);
}
