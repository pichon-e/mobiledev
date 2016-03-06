package epitech.newsbeautifier;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import epitech.newsbeautifier.controllers.AddSourceFragment;
import epitech.newsbeautifier.controllers.FavoritesFragment;
import epitech.newsbeautifier.controllers.HomePageFragment;
import epitech.newsbeautifier.models.User;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private AddSourceFragment   addSourceFragment;
    private HomePageFragment    homePageFragment;
    private FavoritesFragment   favoritesFragment;
    private DrawerLayout        drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Consts.setFab((FloatingActionButton) findViewById(R.id.fab));
        Consts.getFab().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "The news has been added in your favorites", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Consts.getFab().setVisibility(View.GONE);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        homePageFragment = new HomePageFragment();
        addSourceFragment = new AddSourceFragment();
        favoritesFragment = new FavoritesFragment();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (savedInstanceState == null) {
            MenuItem item =  navigationView.getMenu().getItem(0);
            onNavigationItemSelected(item);
        }
        navigationView.setNavigationItemSelectedListener(this);
        Consts.setActivity(this);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        switch (id) {
            case R.id.nav_sources:
                fragment = homePageFragment;
                break;
            case R.id.nav_favorites:
                fragment = favoritesFragment;
                break;
            case R.id.nav_add_source:
                fragment = addSourceFragment;
                break;
        }

        setTitle(item.getTitle());
        drawer.closeDrawers();

        // Insert the fragment by replacing any existing fragment
        Consts.setFragmentManager(getSupportFragmentManager());
        Consts.getFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();

        // Highlight the selected item, update the title, and close the drawer
        // Highlight the selected item has been done by NavigationView
        item.setChecked(true);

        return true;
    }
}
