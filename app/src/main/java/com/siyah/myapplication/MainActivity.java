package com.siyah.myapplication;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.siyah.myapplication.Fragment.Sekil10Fragment;
import com.siyah.myapplication.Fragment.Sekil11Fragment;
import com.siyah.myapplication.Fragment.Sekil12Fragment;
import com.siyah.myapplication.Fragment.Sekil13Fragment;
import com.siyah.myapplication.Fragment.Sekil14Fragment;
import com.siyah.myapplication.Fragment.Sekil15Fragment;
import com.siyah.myapplication.Fragment.Sekil16Fragment;
import com.siyah.myapplication.Fragment.Sekil1Fragment;
import com.siyah.myapplication.Fragment.Sekil2Fragment;
import com.siyah.myapplication.Fragment.Sekil3Fragment;
import com.siyah.myapplication.Fragment.Sekil4Fragment;
import com.siyah.myapplication.Fragment.Sekil5Fragment;
import com.siyah.myapplication.Fragment.Sekil6Fragment;
import com.siyah.myapplication.Fragment.Sekil7Fragment;
import com.siyah.myapplication.Fragment.Sekil8Fragment;
import com.siyah.myapplication.Fragment.Sekil9Fragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fr = new Sekil1Fragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, fr);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fr = null;

        if (id == R.id.sekil1) {    fr = new Sekil1Fragment();   }
        else if(id ==R.id.sekil2) {    fr = new Sekil2Fragment();   }
        else if(id ==R.id.sekil3) {    fr = new Sekil3Fragment();   }
        else if(id ==R.id.sekil4) {    fr = new Sekil4Fragment();   }
        else if(id ==R.id.sekil5) {    fr = new Sekil5Fragment();   }
        else if(id ==R.id.sekil6) {    fr = new Sekil6Fragment();   }
        else if(id ==R.id.sekil7) {    fr = new Sekil7Fragment();   }
        else if(id ==R.id.sekil8) {    fr = new Sekil8Fragment();   }
        else if(id ==R.id.sekil9) {    fr = new Sekil9Fragment();   }
        else if(id ==R.id.sekil10) {    fr = new Sekil10Fragment();   }
        else if(id ==R.id.sekil11) {    fr = new Sekil11Fragment();   }
        else if(id ==R.id.sekil12) {    fr = new Sekil12Fragment();   }
        else if(id ==R.id.sekil13) {    fr = new Sekil13Fragment();   }
        else if(id ==R.id.sekil14) {    fr = new Sekil14Fragment();   }
        else if(id ==R.id.sekil15) {    fr = new Sekil15Fragment();   }
        else if(id ==R.id.sekil16) {    fr = new Sekil16Fragment();   }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, fr);
        fragmentTransaction.commit();


        return true;
    }


}
