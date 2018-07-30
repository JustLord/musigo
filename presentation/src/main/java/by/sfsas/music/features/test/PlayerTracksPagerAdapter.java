package by.sfsas.music.features.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Date: 16/1/28 17:24
 */
public class PlayerTracksPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mFragments;

    public PlayerTracksPagerAdapter(FragmentManager fm, ArrayList<Fragment> mFragments) {
        super(fm);
        this.mFragments = mFragments;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }
}
