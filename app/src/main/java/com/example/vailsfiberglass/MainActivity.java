package com.example.vailsfiberglass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int Quote = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NewQuote(View view) {
        Intent intent = new Intent (this, IDFormFill.class);
        startActivity(intent);

    }
    public void LoadQuote(View view) {
        Intent intent = new Intent (this, ContinueQuote.class);
        startActivity(intent);

    }
}
