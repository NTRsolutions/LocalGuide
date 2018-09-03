package com.example.system.localguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To enable a drawer option
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);


        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find the View that shows the History category
        Button history = findViewById(R.id.history_button);

        // Find the View that shows the transport category
        Button transport = findViewById(R.id.transport_button);

        // Find the View that shows the culture category
        Button culture = findViewById(R.id.culture_button);

        // Find the View that shows the now places to visit category
        Button placesToVisit = findViewById(R.id.places_to_visit_button);

        // Find the View that shows the now eatery category
        Button eatery = findViewById(R.id.eatery_button);

        // Find the View that shows the now hidden gem category
        Button hiddenGem = findViewById(R.id.hidden_gem_button);

        history.setOnClickListener(this);
        transport.setOnClickListener(this);
        culture.setOnClickListener(this);
        placesToVisit.setOnClickListener(this);
        eatery.setOnClickListener(this);
        hiddenGem.setOnClickListener(this);


    }

    @Override
    public void onClick(View V) {
        int id = V.getId();
        switch (id) {
            case R.id.history_button:
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyIntent);
                break;
            case R.id.culture_button:
                Intent cultureIntent = new Intent(MainActivity.this, CultureActivity.class);
                startActivity(cultureIntent);
                break;
            case R.id.places_to_visit_button:
                Intent placesToVisitIntent = new Intent(MainActivity.this, PlacesToVisitAvtivity.class);
                startActivity(placesToVisitIntent);
                break;
            case R.id.eatery_button:
                Intent eateryIntent = new Intent(MainActivity.this, EateryActivity.class);
                startActivity(eateryIntent);
                break;
            case R.id.hidden_gem_button:
                Intent hiddenGemIntent = new Intent(MainActivity.this, HiddenGemActivity.class);
                startActivity(hiddenGemIntent);
                break;

        }
    }


    /**
     * To activate the drawer.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }
    }

    /**
     * To implement onclick on the drawer options
     */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.history) {
            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, HistoryActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.culture) {// Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, CultureActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.places_to_visit) {
            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, PlacesToVisitAvtivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.eatery) {
            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, EateryActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.hidden_gem) {
            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, HiddenGemActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.transport) {
            // Set a click listener on that View
            mDrawerLayout.setOnClickListener(
                    new View.OnClickListener() {
                        // The code in this method will be executed when the numbers View is clicked on.
                        @Override
                        public void onClick(View view) {
                            Intent numbersIntent = new Intent(MainActivity.this, TransportActivity.class);
                            startActivity(numbersIntent);
                        }
                    }
            );
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
