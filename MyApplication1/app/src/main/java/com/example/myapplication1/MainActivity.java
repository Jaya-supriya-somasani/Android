package com.example.myapplication1;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String msg = "App started: First";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg,"The onCreate() event");
    }

    public void btnOnclickText(View view) {
        //TextView m=findViewById(R.id.txtMsg);

//        SecondActivity.Companion.launchActivity(this);

        Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"The onRestart() event");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d(msg,"The onStart() event");
    }
    @Override
    protected void onResume() {
        Log.d(msg,"The onResume() event");
        super.onResume();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(msg,"The onPause() Event");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d(msg,"The onStop() Event");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(msg,"The onSaveInstanceState() Event");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(msg,"The onRestoreInstanceState() Event");

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d(msg,"The onDestroy() Event");
    }

}