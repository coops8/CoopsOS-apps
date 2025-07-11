
package com.coops.splash;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView logo = new TextView(this);
        logo.setText("∞ CoopsOS is booting...");
        setContentView(logo);

        MediaPlayer player = MediaPlayer.create(this, R.raw.bootsound);
        player.start();

        new Handler().postDelayed(() -> {
            logo.setText("✅ Boot Complete. Welcome, Coops.");
        }, 5000);
    }
}
