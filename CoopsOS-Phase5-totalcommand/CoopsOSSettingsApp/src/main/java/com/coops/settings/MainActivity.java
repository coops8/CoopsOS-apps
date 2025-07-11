
package com.coops.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {
    private boolean devUnlocked = false;
    private int tapCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 40, 40, 40);

        TextView title = new TextView(this);
        title.setText("⚙️ CoopsOS Settings");
        layout.addView(title);

        Button easterEgg = new Button(this);
        easterEgg.setText("Tap 7 times to unlock Dev Mode");
        layout.addView(easterEgg);

        TextView devStatus = new TextView(this);
        layout.addView(devStatus);

        easterEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapCount++;
                if (tapCount >= 7 && !devUnlocked) {
                    devUnlocked = true;
                    devStatus.setText("✅ Developer Mode Activated!");
                } else {
                    devStatus.setText("Taps: " + tapCount);
                }
            }
        });

        setContentView(layout);
    }
}
