package com.quantumarc.voidvoyager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

/**
 * Main dashboard screen that matches the provided XML (cards for Planets, Moons, Stars, Galaxies, Nebulae, Missions).
 * Make sure the layout file you posted is saved as: res/layout/activity_main.xml
 * (If it has a different name, adjust setContentView accordingly.)
 */
public class MainActivity extends AppCompatActivity {

    private CardView cardPlanets;
    private CardView cardMoons;
    private CardView cardStars;
    private CardView cardGalaxies;
    private CardView cardNebulae;
    private CardView cardMissions;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // If your XML file name is different, change below (e.g., R.layout.activity_dashboard)
        setContentView(R.layout.activity_main);

        initViews();
        bindCardClicks();
    }

    private void initViews() {
        cardPlanets   = findViewById(R.id.cardPlanets);
        cardMoons     = findViewById(R.id.cardMoons);
        cardStars     = findViewById(R.id.cardStars);
        cardGalaxies  = findViewById(R.id.cardGalaxies);
        cardNebulae   = findViewById(R.id.cardNebulae);
        cardMissions  = findViewById(R.id.cardMissions);
    }

    private void bindCardClicks() {
        // These classes must exist (you created them earlier). Adjust names if different.
        setCardClick(cardPlanets, PlanetsActivity.class);
        setCardClick(cardMoons, MoonActivity.class);
        setCardClick(cardStars, StarsActivity.class);
        setCardClick(cardGalaxies, GalaxiesActivity.class);
        setCardClick(cardNebulae, NebulaeActivity.class);
        setCardClick(cardMissions, MissionsActivity.class);
    }

    private void setCardClick(@Nullable View card, Class<?> targetActivity) {
        if (card == null) return;
        card.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, targetActivity);
                startActivity(intent);
            } catch (Exception e) {
                // If the activity class isn't found or not in manifest
                Toast.makeText(
                        MainActivity.this,
                        "Activity not available: " + targetActivity.getSimpleName(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}