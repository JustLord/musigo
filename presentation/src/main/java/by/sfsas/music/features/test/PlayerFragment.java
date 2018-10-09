package by.sfsas.music.features.test;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;

import java.util.ArrayList;

import by.sfsas.music.R;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropTransformation;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;


public class PlayerFragment extends Fragment {
    Bitmap bitmap = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_player, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(TrackImageFragment.createFor(""));
        fragments.add(TrackImageFragment.createFor(""));
        fragments.add(TrackImageFragment.createFor(""));
        PlayerTracksPagerAdapter adapter = new PlayerTracksPagerAdapter(((AppCompatActivity)getContext()).getSupportFragmentManager(), fragments);
        ViewPager viewPager = view.findViewById(R.id.view_pager_player);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.background_image);

        MultiTransformation multi = new MultiTransformation(
                new CropTransformation(400, 400),
                new BlurTransformation(12, 3));

        Glide.with(getContext())
                .load(R.drawable.a3)
                .apply(bitmapTransform(multi))
                .into(imageView);
    }
}
