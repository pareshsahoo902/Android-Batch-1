package com.release.demoapk.Fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.release.demoapk.NewFrag;

public class FragAdapater extends FragmentPagerAdapter {

    private Context mContext;
    int tabCount;


    public FragAdapater(@NonNull  FragmentManager fm , Context context, int tabs) {
        super(fm);
        this.mContext = context;
        this.tabCount = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                NewFrag newFrag = new NewFrag();
                return newFrag;

            case 1:
                OldFrag old = new OldFrag();
                return old;


            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
