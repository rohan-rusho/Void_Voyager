package com.quantumarc.voidvoyager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class NebulaeActivity extends AppCompatActivity {

    private AppCompatButton btnShareNebulae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nebulae);

        btnShareNebulae = findViewById(R.id.btnShareNebulae);
        if (btnShareNebulae != null) {
            btnShareNebulae.setOnClickListener(v -> shareNebulaeInfo());
        }
    }

    private void shareNebulaeInfo() {
        String shareText =
                "Nebulae 🌌\n\n" +
                        "Definition:\n" +
                        "Vast cosmic clouds of gas and dust—stellar nurseries or remnants of dying stars.\n\n" +
                        "Main Types:\n" +
                        "Emission, Reflection, Dark, Planetary, Supernova Remnant, Molecular Clouds.\n\n" +
                        "Star Formation:\n" +
                        "Gravity collapses cold regions → protostars → fusion ignites → winds sculpt gas.\n\n" +
                        "Why They Matter:\n" +
                        "They recycle and enrich material, seeding new stars and planets.\n\n" +
                        "Fun Facts:\n" +
                        "• Orion Nebula births young stars.\n" +
                        "• Pillars of Creation are eroding columns.\n" +
                        "• Planetary nebulae aren’t planets.\n" +
                        "• Supernova debris spreads heavy elements.\n\n" +
                        "Explore the Nebulae!";
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(i, "Share Nebulae"));
    }
}