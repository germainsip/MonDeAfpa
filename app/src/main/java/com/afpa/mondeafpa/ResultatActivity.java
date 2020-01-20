package com.afpa.mondeafpa;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class ResultatActivity extends AppCompatActivity {

    private TextView resultat;
    private int nbFaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        // Récupère les infos de Intent
        Intent intent = getIntent();
        nbFaces = intent.getIntExtra(MainActivity.EXTRA_NBFACES,1);

        String nbFacesSt ="Pour un Dé à "+ nbFaces +" Faces";
        //String tirage = String.valueOf((int) (nbFaces * Math.random()));
        // Trouve le TextView et modifie le texte.TextVia
        resultat = findViewById(R.id.resultat);
        TextView report = findViewById(R.id.nombreDeFacesReport);
        report.setText(nbFacesSt);
        relancer();
    }




    public void relancer(){
        Random fortune = new Random();
        int tirageNum = fortune.nextInt(nbFaces)+1;
        this.resultat.setText(String.valueOf(tirageNum));

    }

    public void relancer(View view) {
        relancer();
    }
}
