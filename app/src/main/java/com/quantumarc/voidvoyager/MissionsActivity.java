package com.quantumarc.voidvoyager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MissionsActivity extends AppCompatActivity {

    private AppCompatButton btnShareMissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missions);

        btnShareMissions = findViewById(R.id.btnShareMissions);
        if (btnShareMissions != null) {
            btnShareMissions.setOnClickListener(v -> shareMissionsInfo());
        }
    }

    private void shareMissionsInfo() {
        String shareText =
                "Space Missions 🚀\n\n" +
                        "Definition:\n" +
                        "Scientific journeys using orbiters, landers, rovers, telescopes, probes, or crewed spacecraft.\n\n" +
                        "Historic Highlights:\n" +
                        "Sputnik 1 • Apollo 11 • Voyager 1 • Hubble • Mars Pathfinder • ISS.\n\n" +
                        "Mission Types:\n" +
                        "Orbiter, Lander, Rover, Probe, Telescope, Crew.\n\n" +
                        "Why They Matter:\n" +
                        "Advance science, tech, exploration, and global cooperation.\n\n" +
                        "Fun Facts:\n" +
                        "• Voyager 1 carries a Golden Record.\n" +
                        "• Perseverance stores Mars samples.\n" +
                        "• JWST sees early galaxies.\n\n" +
                        "Explore the Missions!";
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(i, "Share Missions"));
    }
}