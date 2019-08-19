package com.example.abdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button azkar = findViewById( R.id.azkar );
        Button about = findViewById( R.id.about );
        Button close = findViewById( R.id.close );

        azkar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this,Azkar.class );
                startActivity( intent );
            }
        } );

        about.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MainActivity.this,About.class );
                startActivity( intent );
            }
        } );
        close.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        } );
    }
}
