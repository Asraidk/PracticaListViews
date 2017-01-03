package com.example.portatil.practicalistviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewSimple extends AppCompatActivity {

    final String []  datos = new String[]{"Element1", "Element2", "Element3", "Element4", "Element5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);

        ListView lstOpciones = (ListView) findViewById(R.id.LstOpciones);

        final String[] datos = new String[]{"Element1","Element2","Element3","Element4"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);

        lstOpciones.setAdapter(adaptador);


    }
}
