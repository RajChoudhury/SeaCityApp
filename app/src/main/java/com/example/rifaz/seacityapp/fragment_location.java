package com.example.rifaz.seacityapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rifaz on 29/01/2015.
 */
public class fragment_location extends android.support.v4.app.Fragment {
    View rootview;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.layout_location, container, false);
        return rootview;
    }
}
