package com.quantumarc.voidvoyager;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MoonActivity extends AppCompatActivity {

    private AppCompatButton btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);

        btnShare = findViewById(R.id.btnShareMoons);
        if (btnShare != null) {
            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareMoonsInfo();
                }
            });
        }
    }

    private void shareMoonsInfo() {
        String shareText =
                "Moons (Natural Satellites)\n\n" +
                        "Definition:\n" +
                        "Moons are objects that orbit planets or dwarf planets. They can be rocky, icy, volcanic, or ocean-bearing worlds.\n\n" +
                        "Notable Moons:\n" +
                        "Earth: The Moon\n" +
                        "Jupiter: Io, Europa, Ganymede, Callisto\n" +
                        "Saturn: Titan, Enceladus, Mimas\n" +
                        "Neptune: Triton\n" +
                        "Pluto: Charon\n" +
                        "Mars: Phobos & Deimos\n\n" +
                        "Why They Matter:\n" +
                        "Moons reveal clues about planetary formation, hidden oceans, geology, and the potential for life beyond Earth.\n\n" +
                        "Fun Facts:\n" +
                        "• Ganymede is the largest moon.\n" +
                        "• Io erupts constantly with sulfur volcanoes.\n" +
                        "• Europa may host a global subsurface ocean.\n" +
                        "• Titan has rivers and lakes of methane.\n" +
                        "• Enceladus sprays water vapor into space.\n\n" +
                        "Explore the Moons!\n" +
                        "Each moon is a world of its own. Which one will you explore next?";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(intent, "Share via"));
    }
}