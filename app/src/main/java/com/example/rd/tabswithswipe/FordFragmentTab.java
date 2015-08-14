package com.example.rd.tabswithswipe;

/**
 * Created by rd on 13/08/15.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FordFragmentTab extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.ford_layout, container, false);

        return rootView;

    }

}