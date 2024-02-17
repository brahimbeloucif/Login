package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    Button logOut;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Find views
        logOut = findViewById(R.id.logOut_btn);
        videoView = findViewById(R.id.video_view);

        // Set video file path
        // Assuming your video file is located in the raw folder
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.homev;

// Set video Uri to VideoView
        Uri uri = Uri.parse(videoPath);

        // Set video Uri to VideoView
        videoView.setVideoURI(uri);

        // Start video playback
        videoView.start();

        // Set click listener for log out button
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
