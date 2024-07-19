package com.example.intership5stopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intership5stopwatch.R;

public class MainActivity extends AppCompatActivity {

    private TextView timerText;
    private Button startButton, stopButton, holdButton;
    private Handler handler;
    private long startTime, elapsedTime;
    private boolean running, hold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerText = findViewById(R.id.timerText);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        holdButton = findViewById(R.id.holdButton);

        handler = new Handler();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!running) {
                    startTime = System.currentTimeMillis() - elapsedTime;
                    handler.postDelayed(updateTimer, 0);
                    running = true;
                    hold = false;
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(updateTimer);
                elapsedTime = 0;
                running = false;
                hold = false;
                timerText.setText("00:00:00");
            }
        });

        holdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (running) {
                    if (!hold) {
                        handler.removeCallbacks(updateTimer);
                        hold = true;
                    } else {
                        startTime = System.currentTimeMillis() - elapsedTime;
                        handler.postDelayed(updateTimer, 0);
                        hold = false;
                    }
                }
            }
        });
    }

    private Runnable updateTimer = new Runnable() {
        @Override
        public void run() {
            if (!hold) {
                elapsedTime = System.currentTimeMillis() - startTime;
                int seconds = (int) (elapsedTime / 1000);
                int minutes = seconds / 60;
                int hours = minutes / 60;
                seconds = seconds % 60;
                minutes = minutes % 60;

                timerText.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                handler.postDelayed(this, 1000);
            }
        }
    };
}