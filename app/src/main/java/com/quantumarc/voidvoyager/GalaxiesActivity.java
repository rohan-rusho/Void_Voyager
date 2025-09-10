package com.quantumarc.voidvoyager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GalaxiesActivity extends AppCompatActivity {

    private AppCompatButton btnShareGalaxies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galaxies);

        btnShareGalaxies = findViewById(R.id.btnShareGalaxies);
        if (btnShareGalaxies != null) {
            btnShareGalaxies.setOnClickListener(v -> shareGalaxiesInfo());
        }
    }

    private void shareGalaxiesInfo() {
        String shareText =
                "Galaxies 🌌\n\n" +
                        "Definition:\n" +
                        "Massive gravitational systems of stars, gas, dust, dark matter—often with a central black hole.\n\n" +
                        "Types:\n" +
                        "Spiral, Barred Spiral, Elliptical, Irregular, Dwarf.\n\n" +
                        "Structure:\n" +
                        "Dark matter halo, disk, bulge, (bar), nucleus.\n\n" +
                        "Why They Matter:\n" +
                        "They forge stars and elements; mergers reshape cosmic evolution.\n\n" +
                        "Fun Facts:\n" +
                        "• Milky Way + Andromeda will merge.\n" +
                        "• Dwarfs are the most common.\n" +
                        "• Quasars are ultra-bright galactic cores.\n\n" +
                        "Explore the Galaxies!";
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(i, "Share Galaxies"));
    }
}