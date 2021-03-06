package by.sfsas.music.features.base;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends MvpAppCompatActivity implements BaseActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        injectComponent();
        super.onCreate(savedInstanceState);
    }

    protected abstract void injectComponent();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void showActivity(Intent intent) {
        startActivity(intent);
    }

    @Override
    public void finishActivity() {
        finish();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(int resId) {
        Toast.makeText(getApplicationContext(), resId, Toast.LENGTH_SHORT).show();
    }

}
