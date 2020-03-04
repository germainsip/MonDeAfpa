package com.afpa.mondeafpa;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class ResultatActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView resultat;
    private int nbFaces;
    private Button re;

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
        re = (Button) findViewById(R.id.rerunbutt);

        re.setOnClickListener(this);
        report.setText(nbFacesSt);
        relancer();
    }




    public void relancer(){
        Random fortune = new Random();
        int tirageNum = fortune.nextInt(nbFaces)+1;
        this.resultat.setText(String.valueOf(tirageNum));

    }


    @Override
    public void onClick(View v) {
if (v == re){
    relancer();
}
    }
}
