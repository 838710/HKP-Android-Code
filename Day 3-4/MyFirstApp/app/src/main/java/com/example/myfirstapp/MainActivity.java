package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("tag", "App created"); //First step of the activity life cycle
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "App started"); //Second step after app is created
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "App resumed"); /*Happens after onStart, or onPause. The activity
        is in this state when the user interacts with the app*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "App paused"); /*Happens when another app is brought to the foreground,
        all important data temporarily saved*/
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "App stopped"); /*activity stopped completely as user interacts
        with another app. Moves to onRestart once the stopped app is interacted with once more.*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "App destroyed"); //Activity completely destroyed and removed from memory
    }
}