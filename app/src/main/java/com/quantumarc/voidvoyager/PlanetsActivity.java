package com.quantumarc.voidvoyager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.quantumarc.voidvoyager.R;

public class PlanetsActivity extends AppCompatActivity {

    private AppCompatButton btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        btnShare = findViewById(R.id.btnSharePlanets);
        if (btnShare != null) {
            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sharePlanetsInfo();
                }
            });
        }
    }

    private void sharePlanetsInfo() {
        // Using hard-coded text; can switch to getString() if you adopt strings_planet.xml
        String shareText =
                "Planets\n\n" +
                        "Definition:\n" +
                        "Planets are large, round objects in space that orbit stars. In our solar system, there are 8 recognized planets orbiting the Sun.\n\n" +
                        "Planets in Our Solar System:\n" +
                        "• Mercury\n• Venus\n• Earth\n• Mars\n• Jupiter\n• Saturn\n• Uranus\n• Neptune\n\n" +
                        "Why Planets Matter:\n" +
                        "Planets are fascinating worlds, each unique. They teach us about our solar system, the origins of life, and the universe.\n\n" +
                        "Fun Facts:\n" +
                        "• Jupiter is the largest planet in our solar system.\n" +
                        "• Venus is the hottest planet.\n" +
                        "• Mars is called the Red Planet.\n" +
                        "• Neptune has the strongest winds.\n\n" +
                        "Explore the Planets!\n" +
                        "Learn more about each planet and how they make our solar system so amazing.";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(intent, "Share via"));
    }
}