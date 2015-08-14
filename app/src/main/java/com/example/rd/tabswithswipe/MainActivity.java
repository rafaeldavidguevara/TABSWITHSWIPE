package com.example.rd.tabswithswipe;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    // Declaring our tabs and the corresponding fragments.
    ActionBar.Tab bmwTab, fordTab, toyotaTab;
    Fragment bmwFragmentTab = new BmwFragmentTab();
    Fragment toyotaFragmentTab = new ToyotaFragmentTab();
    Fragment fordFragmentTab = new FordFragmentTab();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);

        // Asking for the default ActionBar element that our platform supports.
        ActionBar actionBar = getActionBar();

        // Screen handling while hiding ActionBar icon.
        actionBar.setDisplayShowHomeEnabled(false);

        // Screen handling while hiding Actionbar title.
        actionBar.setDisplayShowTitleEnabled(false);

        // Creating ActionBar tabs.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Setting custom tab icons.
        bmwTab = actionBar.newTab().setText(R.string.bmw);
        toyotaTab = actionBar.newTab().setText(R.string.toyota);
        fordTab = actionBar.newTab().setText(R.string.ford);

        // Setting tab listeners.
        bmwTab.setTabListener(new TabListener(bmwFragmentTab));
        toyotaTab.setTabListener(new TabListener(toyotaFragmentTab));
        fordTab.setTabListener(new TabListener(fordFragmentTab));

        // Adding tabs to the ActionBar.
        actionBar.addTab(bmwTab);
        actionBar.addTab(toyotaTab);
        actionBar.addTab(fordTab);
    }
}