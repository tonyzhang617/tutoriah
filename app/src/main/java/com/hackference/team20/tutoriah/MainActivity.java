package com.hackference.team20.tutoriah;

import android.app.Fragment;
import android.os.Bundle;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.hackference.team20.tutoriah.fragments.AboutUsFragment;
import com.hackference.team20.tutoriah.fragments.IndTutoringFragment;
import com.hackference.team20.tutoriah.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        IndTutoringFragment.OnFragmentInteractionListener,
        ProfileFragment.OnFragmentInteractionListener {

    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setTab(R.id.nav_ind_tutoring, R.string.ind_tutoring, IndTutoringFragment.newInstance());

        // // TODO: 11/26/2016 add welcome dialog
    }

    private void setTab(int tab_id, int string_id, Fragment instance) {
        navigationView.setCheckedItem(tab_id);
        setTitle(string_id);
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, instance).commit();
    }

    private boolean backPressedOnce = false;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (backPressedOnce) {
                finish();
                this.finishAffinity();
            } else {
                backPressedOnce = true;
                Toast.makeText(this, "Press Back Again to Exit", Toast.LENGTH_SHORT).show();
            }
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
        if (id == R.id.menu_item_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment f = getFragmentManager().findFragmentById(R.id.fragment_container);
        switch (id) {
            case R.id.nav_ind_tutoring:
                if (!(f instanceof IndTutoringFragment)) {
                    setTab(R.id.nav_ind_tutoring, R.string.ind_tutoring, IndTutoringFragment.newInstance());
                }
                break;
            case R.id.nav_group_tutoring:
                break;
            case R.id.nav_chat_rooms:
                break;
            case R.id.nav_my_profile:
                if (!(f instanceof ProfileFragment))
                    setTab(R.id.nav_my_profile, R.string.my_profile, ProfileFragment.newInstance());

                break;
            case R.id.nav_settings:
                break;
            case R.id.nav_about_us:
                if (!(f instanceof AboutUsFragment)) {
                    setTab(R.id.nav_about_us, R.string.about_us, AboutUsFragment.newInstance());
                }
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(int action) {

    }

    @Override
    public void onFragmentInteraction() {

    }
}
