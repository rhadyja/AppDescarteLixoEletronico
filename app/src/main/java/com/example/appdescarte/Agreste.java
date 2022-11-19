package com.example.appdescarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Agreste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreste);

        ListView listAgreste = findViewById(R.id.listAgreste);

        ArrayList<String> pontosDeDescarte = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pontosDeDescarte);
        listAgreste.setAdapter(arrayAdapter);

        listAgreste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Agreste.this, "Escolheu: "+position.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Caruaru");
        dados.add("Limoeiro");
        return dados;
    }
}