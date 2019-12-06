package com.example.homework2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    public CharSequence getPageTitle(int position) {
        return position + 1 + "";
    }


    public Fragment getItem(int i) {
        if (0 == i) {
            Fragment firstFragment = new ViewPagerFirst();
            return firstFragment;
        } else if (1 == i) {
            Fragment secondFragment = new ViewPagerSecond();
            return secondFragment;
        } else if (2 == i) {
            Fragment thirdFragment = new ViewPagerThird();
            return thirdFragment;
        } else if (3 == i){
            Fragment forthFragment = new ViewPagerForth();
            return forthFragment;
        }
        return null;
    }


    public int getCount() {
        return 4;
    }
}

