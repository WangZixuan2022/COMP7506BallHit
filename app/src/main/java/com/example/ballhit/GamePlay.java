package com.example.ballhit;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GamePlay extends AppCompatActivity {
    private PopupWindow popupWindow;
    private GameView gameView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game_play);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        gameView = findViewById(R.id.gameview);
    }

    public void showOverlay(View view) {
        gameView.stopGame();

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View overlayView = inflater.inflate(R.layout.overlay_layout, null);

        // Create a PopupWindow or a Dialog to show the overlay page
        popupWindow = new PopupWindow(overlayView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }

    public void onOptionButtonClick(View view) {
        // Get the ID of the clicked view
        int viewId = view.getId();

        if (viewId == R.id.resume) {
            // Handle option 1 click event
            // Toast.makeText(this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
            // Perform the action to go back to the main page, e.g. finish the current activity
            popupWindow.dismiss();
            gameView.resumeGame();
        } else if (viewId == R.id.exit) {
            // Handle option 2 click event
            // Toast.makeText(this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
            // Add your logic for option 2 here
            finish();
        }
    }

}
