package com.example.abdo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Azkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_azkar );

        final MediaPlayer mp1 = MediaPlayer.create( this,R.raw.asl7 );
        final Button play1 = findViewById( R.id.a1 );
        final Button stop1 = findViewById( R.id.a2 );

        play1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        } );
        stop1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
            }
        } );
        ////////////////////////////////////////////////
        final MediaPlayer mp2 = MediaPlayer.create( this,R.raw.asb7na );
        final Button play2 = findViewById( R.id.b1 );
        final Button stop2 = findViewById( R.id.b2 );

        play2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        } );
        stop2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.pause();
            }
        } );
        /////////////////////////////////////////////

        final MediaPlayer mp3 = MediaPlayer.create( this,R.raw.sob7an );
        final Button play3 = findViewById( R.id.c1 );
        final Button stop3 = findViewById( R.id.c2 );

        play3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        } );
        stop3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.pause();
            }
        } );

    }
}
