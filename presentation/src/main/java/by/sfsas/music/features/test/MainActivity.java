package by.sfsas.music.features.test;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import java.util.ArrayList;

import by.sfsas.music.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new PlayerFragment());
        fragments.add(new PlayerPlaylistFragment());
        PlayerTracksPagerAdapter adapter = new PlayerTracksPagerAdapter(getSupportFragmentManager(), fragments);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
    }

    public static Intent getActivityIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }
}
