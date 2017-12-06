package com.example.bendenisshaffer.ourapp;

import android.app.Activity;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainLaindingPage extends AppCompatActivity
         {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */




    private ListView friendList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lainding_page);

        /*mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);*/

        // Set up the drawer.
        /*mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));*/


        friendList = (ListView) findViewById(R.id.test);

        String[] values = new String[] { "Kat", "Mian"};
        LandingPageAdapter adapter = new LandingPageAdapter(this, values);
        friendList.setAdapter(adapter);




    }




}
