package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by prajakkhruasuwan on 10/22/17.
 */

public class CardFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CardFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarkFragment();
        } else if (position == 1) {
            return new MuseumFragment();
        } else if (position == 2) {
            return new ParkFragment();
        } else {
            return new RestroomFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.category_landmark);
            case 1:
                return mContext.getString(R.string.category_museum);
            case 2:
                return mContext.getString(R.string.category_park);
            case 3:
                return mContext.getString(R.string.category_restroom);
            default:
                return mContext.getString(R.string.category_landmark);
        }
    }
}
