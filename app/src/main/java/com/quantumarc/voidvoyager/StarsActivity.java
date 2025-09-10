package com.quantumarc.voidvoyager;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class StarsActivity extends AppCompatActivity {

    private AppCompatButton btnShareStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);

        btnShareStars = findViewById(R.id.btnShareStars);
        if (btnShareStars != null) {
            btnShareStars.setOnClickListener(v -> shareStarsInfo());
        }
    }

    private void shareStarsInfo() {
        String shareText =
                "Stars ⭐\n\n" +
                        "Definition:\n" +
                        "Massive glowing spheres of plasma powered by nuclear fusion.\n\n" +
                        "Life Cycle:\n" +
                        "Nebula → Protostar → Main Sequence → Red Giant/Supergiant → White Dwarf / Neutron Star / Black Hole.\n\n" +
                        "Spectral Types:\n" +
                        "O B A F G K M (Blue → Red). Sun: G2V.\n\n" +
                        "Why They Matter:\n" +
                        "Stars forge the elements and power planetary systems.\n\n" +
                        "Fun Facts:\n" +
                        "• Most stars are red dwarfs.\n" +
                        "• Betelgeuse will one day go supernova.\n" +
                        "• Neutron stars are ultra-dense.\n" +
                        "• Some stars form in binaries.\n\n" +
                        "Explore the Stars!\n" +
                        "Their births, lives, and deaths shape the universe.";

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(i, "Share Stars"));
    }
}