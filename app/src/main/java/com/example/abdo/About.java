package com.example.abdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_about );

        final Button share = findViewById( R.id.share );

        share.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( Intent.ACTION_SEND );
                intent.setType( "text/plain" );
                intent.putExtra( Intent.EXTRA_SUBJECT,"تطبيق أذكار" );
                intent.putExtra( Intent.EXTRA_TEXT,"تطبيق أذكار متنوعة، جرب التطبيق الأن أكثر من رائع....\n https://play.google.com/store/apps/details?id=com.example.abdo" );
                startActivity( Intent.createChooser( intent,"اختر التطبيق" ) );


            }
        } );
    }
}
