package edu.calvin.cs262.pjh26.helloteamgg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchAnalyticsActivity(View view) {
        Intent intent = new Intent(this, Analytics.class);
            startActivity(intent);
    }

    public void launchScheduleActivity(View view) {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
}
