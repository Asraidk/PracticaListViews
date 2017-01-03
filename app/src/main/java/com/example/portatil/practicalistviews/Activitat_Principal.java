package com.example.portatil.practicalistviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activitat_Principal extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat__principal);

        Button ListViewSimple = (Button) findViewById(R.id.button1);
        ListViewSimple.setOnClickListener(this);
        Button ListViewComplex = (Button) findViewById(R.id.button2);
        ListViewComplex.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                Intent enviamentSimple = new Intent(Activitat_Principal.this, ListViewSimple.class);
                startActivity(enviamentSimple);
                break;
            case R.id.button2:

                Intent enviamentComplex = new Intent(Activitat_Principal.this, ListViewComplex.class);

                startActivity(enviamentComplex);
                break;
        }
    }
}
