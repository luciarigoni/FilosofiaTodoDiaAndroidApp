package com.luciarigoni.filosofiatododiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geradordeFrases(View view) {

        String[] frases = {
                "A admiração é própria da natureza do filósofo; e a filosofia deriva apenas da estupefação - Platão",
                "Aquilo que se faz por amor está sempre além do bem e do mal - Friedrich Nietzsche",
                "Só há um caminho para a felicidade. Não nos preocuparmos com coisas que ultrapassam o poder da nossa vontade - Epicuro",
                "A liberdade consiste em fazer o que se deseja - John Stuart Mill",
        };

        Random random = new Random();

        int rnd = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(frases[rnd]);
    }
}